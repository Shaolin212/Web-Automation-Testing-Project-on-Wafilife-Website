package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.CheckOut;
import utilities.ExtentFactory;

public class ProvideInformation extends BaseDriver{
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void openUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:BlueViolet; font-size:20px\"><b><em>Provide all information</em></b></p>")
				.assignAuthor("Shaolin").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test
	public void provideInfo() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Provide all Information of billing and shipping</b></p>");
		CheckOut checkOut = new CheckOut(childTest);
		checkOut.newAccCheckbox();
		checkOut.newAccPassword();
		checkOut.enterName();
		checkOut.enterPhone();
		checkOut.enterAlterPhone();
		checkOut.enterEmailAddr();
		checkOut.selectStates();
		checkOut.selectAnArea();
		checkOut.enterAddress();
		checkOut.enterComments();
		checkOut.clickShipping();
		checkOut.entershippingName();
		checkOut.entershippingPhone();
		checkOut.shippingAlternatePhone();
		checkOut.enterShippingEmailAddr();
		checkOut.shippingStates();
		checkOut.selectShippingArea();
		checkOut.enterShippingAddress();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
