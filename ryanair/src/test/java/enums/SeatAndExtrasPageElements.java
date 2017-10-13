package enums;

public enum SeatAndExtrasPageElements {

    POPUP_BUTTON("button.core-btn-primary:nth-child(3)"),
    SEAT_6D("/html/body/div[7]/div[2]/div[1]/div/div[3]/dialog-body/seat-map/div[2]/div[1]/div/div[2]" +
            "/div[6]/div[5]/span/span"),
    SEAT_6E("/html/body/div[7]/div[2]/div[1]/div/div[3]/dialog-body/seat-map/div[2]/div[1]/div/div[2]" +
            "/div[6]/div[6]/span/span"),
    SEAT_6F("/html/body/div[7]/div[2]/div[1]/div/div[3]/dialog-body/seat-map/div[2]/div[1]/div/div[2]" +
            "/div[6]/div[7]/span/span"),
    NEXT_BUTTON(".//*[@id='ngdialog1']/div[2]/div[1]/di" +
            "v/div[4]/dialog-footer/dialog-overlay-footer/div/div[" +
            "3]/disabled-tooltip/span/ng-transclude/tooltip-target/button-spinner/button"),
    CONFIRM_PANE("/html/body/div[7]/div[2]/div[1]/div/div[3]/dialog-body/confirm-seats/div/div[3]/div[1]"),
    CONFIRM_BUTTON(".core-btn-primary.dialog-overlay-footer__ok-button"),
    OK_BUTTON(".dialog-overlay-footer__ok-button"),
    POPUP_LINK("/html/body/div[7]/div[2]/div[1]/div/div[3]/dialog-body/confirm-seats/div[2]/div/div[2]/div[2]/div[3]/a"),
    CHECK_OUT_BUTTON("/html/body/div[2]/main/section/total-header/section[2]/article/div[2]/section/div[2]/button");

    private String elementId;

    SeatAndExtrasPageElements(String elementId) {
        this.elementId = elementId;
    }

    public String value() {
        return elementId;
    }
}
