package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Page;

import static enums.PaymentPageElements.*;

public class PaymentCreditCardData extends Page {
    public PaymentCreditCardData(WebDriver driver) {
        super(driver);
    }


    public void selectCreditCardType() {
        WebElement selectMasterCard = new Select(driver
                .findElement(By.cssSelector(MASTER_CARD.value()))
                .findElement(By.tagName("select"))).getOptions().get(2);
        selectMasterCard.click();
    }

    public void selectExpirationMonth() {
        WebElement selectOctober = new Select(driver.findElement(By.cssSelector(OCTOBER.value()))
                .findElement(By.tagName("select"))).getOptions().get(10);
        selectOctober.click();
    }

    public void selectExpirationYear() {
        WebElement select2018 = new Select(driver.findElement(By.cssSelector(YEAR_2018.value()))
                .findElement(By.tagName("select"))).getOptions().get(2);
        select2018.click();
    }

    public void fillSecurityCode(String ccv) {
        driver.findElement(By.cssSelector(CCV_CODE.value()))
                .findElement(By.tagName("input"))
                .sendKeys(ccv);
    }

    public void fillCardholderName(String name, String surname) {
        driver.findElement(By.cssSelector(CREDIT_CARD_HOLDER_NAME.value()))
                .findElement(By.tagName("input")).sendKeys(name + "" + surname);
    }

    public void fillCreditCardNumber(String creditCardNumber) {
        driver.findElement(By.cssSelector(CREDIT_CART_NUMBER_INPUT.value()))
                .findElement(By.tagName("input")).sendKeys(creditCardNumber);
    }
}
