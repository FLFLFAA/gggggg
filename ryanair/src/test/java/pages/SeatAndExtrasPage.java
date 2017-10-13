package pages;

import enums.SeatAndExtrasPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static enums.SeatAndExtrasPageElements.*;

public class SeatAndExtrasPage extends Page {

    public SeatAndExtrasPage(WebDriver driver) {
        super(driver);
    }

    public void closePopUp() {
        setWebDriverWait(driver, 30);
        WebElement popUpButton = waitDriver.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector(POPUP_BUTTON.value())));
        popUpButton.click();
    }

    public void selectPlaces(SeatAndExtrasPageElements firstSeat, SeatAndExtrasPageElements secondSeat,
                             SeatAndExtrasPageElements thirdSeat) {
        WebElement st1 = waitDriver.until(ExpectedConditions.elementToBeClickable(
                By.xpath(firstSeat.value())));
        st1.click();
        WebElement st2 = waitDriver.until(ExpectedConditions.elementToBeClickable(
                By.xpath(secondSeat.value())));
        st2.click();
        WebElement st3 = waitDriver.until(ExpectedConditions.elementToBeClickable(
                By.xpath(thirdSeat.value())));
        st3.click();
    }

    public void clickOnNextButton() {
        driver.findElement(By.xpath(NEXT_BUTTON.value())).click();
    }

    public void clickOnConfirmButton() {
        WebElement confirmButton = waitDriver.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.cssSelector(CONFIRM_BUTTON.value()))));
        confirmButton.click();
    }

    public void closePriorBagPopup() {
        WebElement confirmPane = waitDriver.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(CONFIRM_PANE.value())));
        if (confirmPane.isDisplayed() && confirmPane.isEnabled())
            driver.findElement(By.cssSelector(OK_BUTTON.value())).click();

        WebElement popupLink = waitDriver.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(POPUP_LINK.value())));
        popupLink.click();
    }

    public void clickOnCheckOutButton() {
        WebElement checkOutButton_ = waitDriver.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(CHECK_OUT_BUTTON.value())));
        checkOutButton_.click();
        WebElement checkOutButton = waitDriver.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(CHECK_OUT_BUTTON.value())));
        checkOutButton.click();
    }
}
