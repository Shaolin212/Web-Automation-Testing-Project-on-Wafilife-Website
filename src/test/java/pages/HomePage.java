package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenshot;

public class HomePage extends CommonMethods{
	
	ExtentTest test;
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//span[@class='menu-label-level-0'][contains(text(),'লেখক')]")
	public WebElement lekhok;

	@FindBy(css = ".next.page-numbers")
	public WebElement nextPage;
	
	@FindBy(xpath = "//h3[contains(text(),'দুঃখিত কোন কিছু খুঁজে পাওয়া যায়নি!')]")
	public WebElement blankPage;
	
	@FindBy(xpath = "//a[@href='/cat/books/author/']")
	public WebElement againGoToLekhok;
	
	@FindBy(xpath = "//h3[contains(text(),'Afrin Jahan')]")
	public WebElement authorName;
	
	@FindAll({
		@FindBy(xpath = "//a[@href='https://www.wafilife.com/shop/books/an-introduction-to-bangladesh-economy/']"),
		@FindBy(xpath = "//a[contains(text(),'An Introduction to Bangladesh Economy')]")
	})
	public WebElement choosebook;
	
	public void clickOnLekhok() throws IOException {
		test.info("Click on Lekhok");
		try {
			if (lekhok.isDisplayed()) { 
				lekhok.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Lekhok Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "LekhokPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LekhokPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Lekhok location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "LekhokFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LekhokFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(lekhok.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		sleep(5000);
	}
	
	public void clickNextPage() throws IOException {
		test.info("Go to next page");
		try {
			if (nextPage.isDisplayed()) {
				hover(nextPage);
				sleep(5000);
				nextPage.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>NextPage clicked</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ClickNextPagePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickNextPagePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>NextPage not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ClickNextPageFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickNextPageFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(nextPage.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void ifPageBlank() throws IOException {
		test.info("Check if page is blank then again go to Lekhok page");
		try {
			if (blankPage.isDisplayed()) {
				againGoToLekhok.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Page blank checked and again go to Lekhok page</b></p>");
				sleep(8000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "GoToBackPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "GoToBackPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Blank page not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "PageBlankFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PageBlankFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(againGoToLekhok.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void clickAuthorName() throws IOException {
		test.info("Select any Author");
		try {
			if (authorName.isDisplayed()) {
				authorName.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>AuthorName Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "AuthorNamePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorNamePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>AuthorName not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "AuthorNameFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorNameFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(authorName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void chooseABook() throws IOException {
		test.info("View a book");
		try {
			if (choosebook.isDisplayed()) {
				choosebook.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Book Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ClickBookPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickBookPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>This Book not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ClickBookFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickBookFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(choosebook.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
