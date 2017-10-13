package enums;

public enum LogInPopUpElements {

    EMAIL_INPUT("//input[@placeholder='Email address']"),
    PASSWORD_INPUT("//input[@placeholder='Password']"),
    LOG_IN_BUTTON("div.modal-form-group:nth-child(5) > button-spinner:nth-child(1) > button:nth-child(1)");

    private String elementId;

    LogInPopUpElements(String elementId) {
        this.elementId = elementId;
    }

    public String value() {
        return elementId;
    }
}
