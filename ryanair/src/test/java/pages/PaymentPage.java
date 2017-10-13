package pages;

import helpers.PaymentCreditCardData;
import helpers.PaymentPageForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static enums.PaymentPageElements.*;

public class PaymentPage extends Page {

    private PaymentPageForm paymentPageForm;
    private PaymentCreditCardData paymentCreditCardData;

    public PaymentPage(WebDriver driver, PaymentPageForm paymentPageForm, PaymentCreditCardData paymentCreditCardData) {
        super(driver);
        this.paymentPageForm = paymentPageForm;
        this.paymentCreditCardData = paymentCreditCardData;
    }

    public PaymentCreditCardData getPaymentCreditCardData() {
        return paymentCreditCardData;
    }

    public PaymentPageForm getPaymentPageForm() {
        return paymentPageForm;
    }

    public void clickOnLogInButton() {
        setWebDriverWait(driver, 30);
        WebElement logInButton = waitDriver.until(ExpectedConditions
                .elementToBeClickable(By.xpath(LOG_IN_BUTTON.value())));
        logInButton.click();
    }

    public void fillAdress(String adress) {
        driver.findElement(By.xpath(ADRESS_INPUT.value()))
                .sendKeys(adress);
    }

    public void fillCityName(String cityName) {
        driver.findElement(By.xpath(CITY_INPUT.value()))
                .sendKeys(cityName);
    }

    public void fillPostalCode(String postalCode) {
        driver.findElement(By.xpath(POSTAL_CODE_INPUT.value()))
                .sendKeys(postalCode);
    }

    public void acceptTerms() {
        driver.findElement(By.cssSelector(TERMS_CHECKBOX.value()))
                .findElement(By.tagName("input")).click();

    }

    public void clickOnPayNowButton() {
        driver.findElement(By.cssSelector(PAY_NOW_BUTTON.value()))
                .findElement(By.tagName("button")).click();
    }
}
