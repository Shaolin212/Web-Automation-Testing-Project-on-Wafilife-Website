package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenshot;

public class PlaceOrder extends CommonMethods{
	ExtentTest test;
	public PlaceOrder(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test=test;
	}
	
	@FindBy(xpath = "//button[@class='single_add_to_cart_button button alt ']")
	public WebElement clickOrder;

	@FindBy(xpath = "//a[@class='button checkout-link']")
	public WebElement clickToCheckOut;
	
	public void clickToOrder() throws IOException {
		test.info("Click অর্ডার করুন");
		try {
			if (clickOrder.isDisplayed()) { 
				clickOrder.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Order button Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "clickOrderPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOrderPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Order button location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "clickOrderFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOrderFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(clickOrder.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void toCheckOut() throws IOException {
		test.info("Click অর্ডার সম্পন্ন করুন");
		try {
			if (clickToCheckOut.isDisplayed()) { 
				clickToCheckOut.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Complete order button Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "clickCompleteOrderPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickCompleteOrderPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Complete order button location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "clickCompleteOrderFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickCompleteOrderFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(clickToCheckOut.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
