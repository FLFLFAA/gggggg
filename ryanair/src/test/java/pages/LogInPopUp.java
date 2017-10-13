package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static enums.LogInPopUpElements.*;

public class LogInPopUp extends Page {

    public LogInPopUp(WebDriver driver) {
        super(driver);
    }

    public void clickOnPopUpLoginButton() {
        driver.findElement(By.cssSelector(LOG_IN_BUTTON.value()))
                .click();
    }

    public void fillEmail(String email) {
        setWebDriverWait(driver, 30);
        WebElement emailInput = waitDriver.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(EMAIL_INPUT.value())));
        emailInput.click();
        driver.findElement(By.xpath(EMAIL_INPUT.value()))
                .click();
        driver.findElement(By.xpath(EMAIL_INPUT.value()))
                .sendKeys(email);
    }

    public void fillPassword(String password) {
        driver.findElement(By.xpath(PASSWORD_INPUT.value()))
                .click();
        driver.findElement(By.xpath(PASSWORD_INPUT.value()))
                .sendKeys(password);
    }
}
