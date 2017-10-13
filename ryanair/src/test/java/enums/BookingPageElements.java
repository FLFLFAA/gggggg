package enums;

public enum BookingPageElements {

    FLIGHT("#flight-FR\\~3097\\~\\ \\~\\~WAW" +
            "\\~10\\/21\\/2017\\ 08\\:10\\~GDN\\~10\\/21\\/2017\\ 09\\:05\\~ > div:nth-child(1) " +
            "> div:nth-child(2) > flights-table-price:nth-child(1) > div:nth-child(1) > div:nth-child(1) " +
            "> span:nth-child(2)"),
    BASIC_FARE("div.flights-table-fares__fare:nth-child(1) > div:nth-child(5)"),
    CONTINUE_BUTTON(".//*[@id='continue']");

    private String elementId;

    BookingPageElements(String elementId) {
        this.elementId = elementId;
    }

    public String value() {
        return elementId;
    }
}
