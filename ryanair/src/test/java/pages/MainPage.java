package pages;

import enums.MainPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static enums.MainPageElements.*;

public class MainPage extends Page {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void chooseOneWayFlight() {
        driver.findElement(By.xpath(ONE_WAY_RADIO_BUTTON.value()))
                .click();
    }

    public void open(String pageUrl) {
        driver.navigate().to(pageUrl);
    }

    public void selectDepartureAirport(MainPageElements country, MainPageElements airport) {
        driver.findElement(By.xpath(DEPARTURE_AIRPORT_FIELD.value()))
                .clear();
        driver.findElement(By.xpath(DEPARTURE_AIRPORT_FIELD.value()))
                .click();
        checkVisibilityOfDeparturePane();
        driver.findElement(By.cssSelector(country.value()))
                .click();
        driver.findElement(By.cssSelector(airport.value()))
                .click();
    }

    private void checkVisibilityOfDeparturePane() {
        setWebDriverWait(driver, 30);
        WebElement departurePane = waitDriver.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(DEPARTURE_PANE.value())));
        departurePane.click();
    }

    public void selectArrivalAirport(MainPageElements country, MainPageElements airport) {
        driver.findElement(By.cssSelector(country.value()))
                .click();
        driver.findElement(By.cssSelector(airport.value()))
                .click();
    }

    public void selectDate(String date) {
        driver.findElement(By.xpath(DATE_INPUT_FIELD.value()))
                .sendKeys(date);
    }

    public void select2Adt1Chd() {
        driver.findElement(By.cssSelector(PASSENGERS_PANE.value()))
                .click();
        driver.findElement(By.cssSelector(ADD_ADULT_PASSENGER_BUTTON.value()))
                .click();
        driver.findElement(By.cssSelector(PASSENGERS_PANE.value()))
                .click();
        driver.findElement(By.cssSelector(PASSENGERS_PANE.value()))
                .click();
        driver.findElement(By.cssSelector(ADD_CHILD_BUTTON.value()))
                .click();
    }

    public void clickOnLetsGoButton() {
        passengerPaneIsClosed();
        driver.findElement(By.xpath(LETS_GO_BUTTON.value())).click();
    }

    private void passengerPaneIsClosed() {
        WebElement passenger_input = waitDriver.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.xpath(PASSENGER_INPUT.value()))));
        passenger_input.click();
    }

    public void acceptLicence() {
        driver.findElement(By.xpath(LICENCE_SPAN.value())).click();
    }
}
