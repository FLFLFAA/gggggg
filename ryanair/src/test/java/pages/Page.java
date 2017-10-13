package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait waitDriver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    protected void setWebDriverWait(WebDriver driver, int timeInSeconds) {
        waitDriver = new WebDriverWait(driver, timeInSeconds);
    }
}
