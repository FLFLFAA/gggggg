package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static enums.BookingPageElements.*;

public class BookingPage extends Page {

    public BookingPage(WebDriver driver) {
        super(driver);
    }

    public void selectTimeOfFare() {
        setWebDriverWait(driver, 30);
        WebElement flight = waitDriver
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(FLIGHT.value())));
        flight.click();
    }

    public void selectTypeOfFare() {
        WebElement fare = waitDriver.until(ExpectedConditions.elementToBeClickable(By
                .cssSelector(BASIC_FARE.value())));
        fare.click();
    }

    public void clickOnContinueButton() {
        WebElement continueButton = waitDriver
                .until(ExpectedConditions.elementToBeClickable(By.xpath(CONTINUE_BUTTON.value())));
        continueButton.click();
    }
}
