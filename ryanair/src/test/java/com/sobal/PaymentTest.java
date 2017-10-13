package com.sobal;

import helpers.PaymentCreditCardData;
import helpers.PaymentPageForm;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import static enums.MainPageElements.*;
import static enums.SeatAndExtrasPageElements.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PaymentTest {

    @Test
    public void validateErrorMessageAfterWrongCreditCardNumber() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open("https://www.ryanair.com/ie/en");
        mainPage.chooseOneWayFlight();
        mainPage.selectDepartureAirport(POLAND, WARSAW_CHOPIN_AIRPORT);
        mainPage.selectArrivalAirport(POLAND, GDANSK_AIRPORT);
        mainPage.selectDate("21102017");
        mainPage.acceptLicence();
        mainPage.select2Adt1Chd();
        mainPage.clickOnLetsGoButton();

        BookingPage bookingPage = new BookingPage(driver);
        bookingPage.selectTimeOfFare();
        bookingPage.selectTypeOfFare();
        bookingPage.clickOnContinueButton();

        SeatAndExtrasPage spPage = new SeatAndExtrasPage(driver);
        spPage.closePopUp();
        spPage.selectPlaces(SEAT_6D, SEAT_6E, SEAT_6F);
        spPage.clickOnNextButton();
        spPage.clickOnConfirmButton();
        spPage.closePriorBagPopup();
        spPage.clickOnCheckOutButton();

        PaymentPage paymentPage = new PaymentPage(driver, new PaymentPageForm(driver), new PaymentCreditCardData(driver));
        paymentPage.clickOnLogInButton();

        LogInPopUp lgPopup = new LogInPopUp(driver);
        lgPopup.fillEmail("testertestowski781@gmail.com");
        lgPopup.fillPassword("Testtest123");
        lgPopup.clickOnPopUpLoginButton();

        PaymentPageForm paymentPageForm = paymentPage.getPaymentPageForm();
        paymentPageForm.fillFirstPassengerData("Mary", "Doe");
        paymentPageForm.fillSecondPassengerData("John", "Doe");
        paymentPageForm.fillChildPassengerData("Buba", "Doe");
        paymentPageForm.fillPhoneNumber("987654321");

        PaymentCreditCardData paymentCreditCardData = paymentPage.getPaymentCreditCardData();
        paymentCreditCardData.fillCreditCardNumber("5555555555555557");
        paymentCreditCardData.selectCreditCardType();
        paymentCreditCardData.selectExpirationMonth();
        paymentCreditCardData.selectExpirationYear();
        paymentCreditCardData.fillSecurityCode("265");
        paymentCreditCardData.fillCardholderName("John", "Doe");

        paymentPage.fillAdress("Madison Avenue 1");
        paymentPage.fillCityName("New York");
        paymentPage.fillPostalCode("22-100");
        paymentPage.acceptTerms();
        paymentPage.clickOnPayNowButton();

        WebDriverWait waiter = new WebDriverWait(driver, 30);
        WebElement errorMessage = waiter.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("prompt.error")));

        assertTrue("Error message is visible", errorMessage.isDisplayed());

        assertEquals("Error message contains proper title",
                errorMessage.findElement(By.cssSelector(".info-title")).getText(), "Oh. There was a problem");

        assertEquals("Error message contains proper content",
                errorMessage.findElement(By.cssSelector("div.info-text:nth-child(3) > span:nth-child(1)")).getText(),
                "As your payment was not authorised we could not complete your reservation." +
                        " Please ensure that the information was correct or use a new payment to try again");

        driver.manage().deleteAllCookies();
        driver.close();
    }
}
