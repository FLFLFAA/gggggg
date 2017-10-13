package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Page;

import static enums.PaymentPageElements.*;

public class PaymentPageForm extends Page {

    public PaymentPageForm(WebDriver driver) {
        super(driver);
    }

    public void fillFirstPassengerData(String name, String surname) {
        WebElement mrsOption = new Select(driver.findElement(By.tagName("select")))
                .getOptions().get(2);
        mrsOption.click();

        driver.findElement(By.name(PASSENGER_FORM_0.value()))
                .findElement(By.xpath(FIRST_PASSENGER_NAME.value()))
                .sendKeys(name);
        driver.findElement(By.name(PASSENGER_FORM_0.value()))
                .findElement(By.xpath(FIRST_PASSENGER_SURNAME.value()))
                .sendKeys(surname);
    }

    public void fillSecondPassengerData(String name, String surname) {
        WebElement mrOption = new Select(driver.findElement(By.name(PASSENGER_FORM_1.value()))
                .findElement(By.tagName("select"))).getOptions().get(1);
        mrOption.click();

        driver.findElement(By.cssSelector(SECOND_PASSENGER_NAME.value()))
                .findElements(By.tagName("input")).get(0).sendKeys(name);
        driver.findElement(By.cssSelector(SECOND_PASSENGER_SURNAME.value()))
                .findElements(By.tagName("input")).get(0).sendKeys(surname);
    }

    public void fillChildPassengerData(String name, String surname) {
        driver.findElement(By.cssSelector(CHILD_NAME.value()))
                .findElement(By.tagName("input")).sendKeys(name);
        driver.findElement(By.cssSelector(CHILD_SURNAME.value()))
                .findElement(By.tagName("input")).sendKeys(surname);
    }

    public void fillPhoneNumber(String phoneNumber) {
        WebElement selectPoland = new Select(driver
                .findElement(By.cssSelector(COUNTRY_SELECTOR.value()))
                .findElement(By.tagName("select"))).getOptions().get(27);
        selectPoland.click();
        driver.findElement(By.xpath(PHONE_NUMBER_INPUT.value()))
                .sendKeys(phoneNumber);
    }
}
