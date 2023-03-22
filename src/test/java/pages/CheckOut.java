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

public class CheckOut extends CommonMethods{
	ExtentTest test;
	public CheckOut(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test=test;
	}
	
	@FindBy(id = "createaccount")
	public WebElement newAccountCheckBox;
	
	@FindBy(id = "account_password")
	public WebElement accPassword;

	@FindBy(id = "billing_first_name")
	public WebElement name;
	
	@FindBy(id = "billing_phone")
	public WebElement phoneNumber;
	
	@FindBy(id = "billing_alternative_phone")
	public WebElement alternatePhone;
	
	@FindBy(id = "billing_email")
	public WebElement emailAddr;
	
	@FindBy(id = "billing_state")
	public WebElement selectState;
	
	@FindBy(id = "billing_area")
	public WebElement selectArea;
	
	@FindBy(id = "billing_address_1")
	public WebElement fullAddress;
	
	@FindBy(id = "order_comments")
	public WebElement comments;
	
	@FindBy(id = "ship-to-different-address-checkbox")
	public WebElement shippingCheckbox;
	
	@FindBy(id = "shipping_first_name")
	public WebElement shippingName;
	
	@FindBy(id = "shipping_phone")
	public WebElement shippingPhone;
	
	@FindBy(id = "shipping_alternative_phone")
	public WebElement shippingAlterPhone;
	
	@FindBy(id = "shipping_email")
	public WebElement shippingEmail;
	
	@FindBy(id = "shipping_state")
	public WebElement shippingState;
	
	@FindBy(id = "shipping_area")
	public WebElement shippingArea;
	
	@FindBy(id = "shipping_address_1")
	public WebElement shippingAddress;
	
	public void newAccCheckbox() throws IOException {
		test.info("Click on new account checkbox");
		try {
			if (newAccountCheckBox.isDisplayed()) { 
				newAccountCheckBox.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>New account checkbox clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "newAccCheckboxPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "newAccCheckboxPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>New account checkbox location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "newAccCheckboxFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "newAccCheckboxFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(newAccountCheckBox.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void newAccPassword() throws IOException {
		test.info("Enter account password");
		try {
			if (accPassword.isDisplayed()) { 
				sendText(accPassword, passwordGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Account password entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterPasswordPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterPasswordPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Password location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterPasswordFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterPasswordFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(accPassword.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterName() throws IOException {
		test.info("Enter Name");
		try {
			if (name.isDisplayed()) { 
				sendText(name, firstNameGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Name entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterNamePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterNamePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Name location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterNameFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterNameFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(name.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterPhone() throws IOException {
		test.info("Enter Phone");
		try {
			if (phoneNumber.isDisplayed()) { 
				sendText(phoneNumber, phoneNumberGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Phone entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterPhonePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterPhonePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Phone location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterPhoneFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterPhoneFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(phoneNumber.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterAlterPhone() throws IOException {
		test.info("Enter alternate phone");
		try {
			if (alternatePhone.isDisplayed()) { 
				sendText(alternatePhone, phoneNumberGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Alternate phone entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterAlterPhonePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterAlterPhonePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Alternate phone location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterAlterPhoneFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterAlterPhoneFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(alternatePhone.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterEmailAddr() throws IOException {
		test.info("Enter Email");
		try {
			if (emailAddr.isDisplayed()) { 
				sendText(emailAddr, emailGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Email entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterEmailAddrPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterEmailAddrPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Email location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterEmailAddrFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterEmailAddrFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(emailAddr.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void selectStates() throws IOException {
		test.info("Select state");
		try {
			if (selectState.isDisplayed()) { 
				selectItemByValue(selectState, "BD-10");
				test.pass("<p style=\"color:green; font-size:13px\"><b>State selected.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "selectStatePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectStatePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>State location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "selectStateFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectStateFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(selectState.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void selectAnArea() throws IOException {
		test.info("Select area");
		try {
			if (selectArea.isDisplayed()) { 
				selectItemByValue(selectArea, "619");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Area selected.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "selectAreaPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectAreaPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Area location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "selectAreaFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectAreaFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(selectArea.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterAddress() throws IOException {
		test.info("Enter Address");
		try {
			if (fullAddress.isDisplayed()) { 
				sendText(fullAddress, "Chandgaon, Chattogram");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Address entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterAddressPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterAddressPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Address location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterAddressFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterAddressFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(fullAddress.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterComments() throws IOException {
		test.info("Enter comment");
		try {
			if (comments.isDisplayed()) { 
				sendText(comments, "Order comments");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Order comment entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterCommentsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterCommentsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Order comment location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "enterCommentsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterCommentsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(comments.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickShipping() throws IOException {
		test.info("Click Shipping checkbox");
		try {
			if (shippingCheckbox.isDisplayed()) { 
				shippingCheckbox.click();;
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping checkbox clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingCheckboxPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingCheckboxPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping checkbox location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingCheckboxFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingCheckboxFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingCheckbox.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void entershippingName() throws IOException {
		test.info("Enter shipping name");
		try {
			if (shippingName.isDisplayed()) { 
				sendText(shippingName, firstNameGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping name entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingNamePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingNamePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping name location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingNameFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingNameFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void entershippingPhone() throws IOException {
		test.info("Enter shipping phone");
		try {
			if (shippingPhone.isDisplayed()) { 
				sendText(shippingPhone, phoneNumberGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping phone entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingPhonePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingPhonePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping phone location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingPhoneFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingPhoneFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingPhone.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void shippingAlternatePhone() throws IOException {
		test.info("Enter shipping alternate phone");
		try {
			if (shippingAlterPhone.isDisplayed()) { 
				sendText(shippingAlterPhone, phoneNumberGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping alternate phone entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingAlterPhonePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingAlterPhonePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping alternate phone location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingAlterPhoneFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingAlterPhoneFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingAlterPhone.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterShippingEmailAddr() throws IOException {
		test.info("Enter shipping email");
		try {
			if (shippingEmail.isDisplayed()) { 
				sendText(shippingEmail, emailGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping email entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingEmailPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingEmailPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping email location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingEmailFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingEmailFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingEmail.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		sleep(5000);
	}
	public void shippingStates() throws IOException {
		test.info("Select shipping state");
		try {
			if (shippingState.isDisplayed()) { 
				selectItemByValue(shippingState, "BD-10");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping state selected.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingStatePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingStatePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping state location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingStateFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingStateFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingState.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void selectShippingArea() throws IOException {
		test.info("Select shipping area");
		try {
			if (shippingArea.isDisplayed()) { 
				selectItemByValue(shippingArea, "622");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping Area selected.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ShippingAreaPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ShippingAreaPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping Area location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "ShippingAreaFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ShippingAreaFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingArea.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterShippingAddress() throws IOException {
		test.info("Enter shipping address");
		try {
			if (shippingAddress.isDisplayed()) { 
				sendText(shippingAddress, "New market, Chattogram");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping Address entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingAddressPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingAddressPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping Address location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenshot.capture(PageDriver.getCurrentDriver(), "shippingAddressFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shippingAddressFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(shippingAddress.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
