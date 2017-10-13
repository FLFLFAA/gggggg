package enums;

public enum PaymentPageElements {

    LOG_IN_BUTTON("/html/body/div[2]/main/section/total-header/div/div/button[2]"),
    FIRST_PASSENGER_NAME("//input[@placeholder='e.g. John']"),
    SECOND_PASSENGER_NAME("ng-form.ng-valid-name:nth-child(2) > " +
            "passenger-input-group:nth-child(2) > div:nth-child(1) > ng-form:nth-child(1) > div:nth-child(2)" +
            " > div:nth-child(2)"),
    FIRST_PASSENGER_SURNAME("//input[@placeholder='e.g. Smith']"),
    SECOND_PASSENGER_SURNAME("ng-form.ng-valid-name:nth-child(2) > passenger-input-group:nth-child(2) >" +
            " div:nth-child(1) > ng-form:nth-child(1) > div:nth-child(2) > div:nth-child(3)"),
    PASSENGER_FORM_0("passengerForm0"),
    PASSENGER_FORM_1("passengerForm1"),
    CHILD_NAME("div.payment-passenger-first-name:nth-child(1)"),
    CHILD_SURNAME("div.payment-passenger-last-name:nth-child(2)"),

    COUNTRY_SELECTOR("div.details-holder:nth-child(1) > div:nth-child(3)"),
    PHONE_NUMBER_INPUT("/html/body/div[2]/main/div[1]/payment/div[2]/div/form" +
            "/div[1]/div[2]/div[2]/contact-details-form/div/div[1]/div[3]/phone-number/div[2]/input"),

    CREDIT_CART_NUMBER_INPUT(".card-seats-flow"),
    MASTER_CARD(".card-type-seats-flow > div:nth-child(1)"),
    OCTOBER("div.date-expiry:nth-child(2)"),
    YEAR_2018("div.date-expiry:nth-child(1)"),
    CCV_CODE(".security-code"),
    CREDIT_CARD_HOLDER_NAME("div.payment-input:nth-child(1)"),

    ADRESS_INPUT("//*[@id=\"billingAddressAddressLine1\"]"),
    CITY_INPUT("//*[@id=\"billingAddressCity\"]"),
    POSTAL_CODE_INPUT("//*[@id=\"billingAddressPostcode\"]"),
    TERMS_CHECKBOX(".terms"),

    PAY_NOW_BUTTON(".cta");

    private String elementId;

    PaymentPageElements(String elementId) {
        this.elementId = elementId;
    }

    public String value() {
        return elementId;
    }
}
