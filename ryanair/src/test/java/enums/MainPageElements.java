package enums;

public enum MainPageElements {

    ONE_WAY_RADIO_BUTTON(".//*[@id='search-container']/div[1]/div/form/div[1]/div/div[2]/label"),
    DEPARTURE_PANE("div.pane:nth-child(1)"),
    DEPARTURE_AIRPORT_FIELD("/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]" +
            "/div/form/div[2]/div/div/div[1]/div[2]/div[2]/div/div[1]/input"),

    POLAND("div.core-list-item:nth-child(37)"),
    WARSAW_CHOPIN_AIRPORT("div.pane:nth-child(2) > div:nth-child(2) > div:nth-child(13) > span:nth-child(1)"),

    GDANSK_AIRPORT("div.pane:nth-child(2) > div:nth-child(2) > div:nth-child(3) > span:nth-child(1)"),
    DATE_INPUT_FIELD(".//*[@id='row-dates-pax']/div[1]/div/div[1]/div/div[2]/div[2]/div/input[1]"),
    LICENCE_SPAN("/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]/div/div/div[2]/div/label/span"),

    PASSENGERS_PANE(".value"),
    PASSENGER_INPUT(".//*[@id='row-dates-pax']/div[2]/div[2]/div[2]/div/div[1]"),
    ADD_ADULT_PASSENGER_BUTTON(".content > popup-content:nth-child(1) > div:nth-child(6) > " +
            "div:nth-child(1) > div:nth-child(3) > core-inc-dec:nth-child(1) > button:nth-child(3)"),
    ADD_CHILD_BUTTON(".content > popup-content:nth-child(1) > div:nth-child(8) " +
            "> div:nth-child(1) > div:nth-child(3) > core-inc-dec:nth-child(1) > button:nth-child(3)"),

    LETS_GO_BUTTON(".//*[@id='search-container']/div[1]/div/form/div[4]/button[2]");

    private String elementId;

    MainPageElements(String elementId) {
        this.elementId = elementId;
    }

    public String value() {
        return elementId;
    }

}
