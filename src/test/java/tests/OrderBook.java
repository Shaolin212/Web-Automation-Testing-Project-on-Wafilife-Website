package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import pages.PlaceOrder;
import utilities.ExtentFactory;

public class OrderBook extends BaseDriver {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void openUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:BlueViolet; font-size:20px\"><b><em>Order a book</em></b></p>")
				.assignAuthor("Shaolin").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void clickLekhok() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Click লেখক from the menu</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnLekhok();
	}
	
	@Test(priority = 1)
	public void goToNextPage() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Scroll Down and go to the Next Page</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickNextPage();
		homePage.ifPageBlank();
	}
	
	@Test(priority = 2)
	public void clickAuthor() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Select any Author</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickAuthorName();
	}
	
	@Test(priority = 3)
	public void clickBook() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>View any Book Details</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.chooseABook();
	}
	@Test(priority = 4)
	public void clickCompleteOrder() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Click অর্ডার করুন</b></p>");
		PlaceOrder placeOrder = new PlaceOrder(childTest);
		placeOrder.clickToOrder();
	}
	@Test(priority = 5)
	public void clicktoCheckOut() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Click অর্ডার সম্পন্ন করুন</b></p>");
		PlaceOrder placeOrder = new PlaceOrder(childTest);
		placeOrder.toCheckOut();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
