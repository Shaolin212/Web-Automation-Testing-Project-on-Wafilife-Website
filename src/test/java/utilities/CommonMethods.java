package utilities;

import java.util.Locale;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import drivers.PageDriver;

public class CommonMethods {

	public String currentPageUrl() {
		return PageDriver.getCurrentDriver().getCurrentUrl();
	}

	public String getTitle() {
		return PageDriver.getCurrentDriver().getTitle();
	}

	public void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public void hover(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.clickAndHold(element).build().perform();
	}

	public void selectItemByValue(WebElement element, String value) {
		Select selectItems = new Select(element);
		selectItems.selectByValue(value);
	}

	public void selectItemByVisibleText(WebElement element, String value) {
		Select selectItems = new Select(element);
		selectItems.selectByVisibleText(value);
	}

	public void selectItemByIndex(WebElement element, int index) {
		Select selectItems = new Select(element);
		selectItems.selectByIndex(index);
	}

	WebDriverWait wait;
	public void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void sleep(int durationMS) {
		try {
			Thread.sleep(durationMS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static Faker faker = new Faker(new Locale("en-US"));
	
	public static String email;

	public static String emailGenerate() {
		email = faker.bothify("????##@mail.com");
		return email;
	}
	
	public static String firstName;

	public static String firstNameGenerate() {
		firstName = faker.name().firstName();
		return firstName;
	}

	public static String lastName;

	public static String lastNameGenerate() {
		lastName = faker.name().lastName();
		return lastName;
	}

	public static String phoneNumber;

	public String phoneNumberGenerate() {
		phoneNumber = faker.numerify("###-###-####");
		return phoneNumber;
	}
	
	public static String password;

	public String passwordGenerate() {
		password = faker.animal().name();
		return password;
	}

}
