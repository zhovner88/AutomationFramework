package pages;

import org.openqa.selenium.WebDriver;

import static utils.selenium.Driver.browser;

public class BasePage extends Page {

    public WebDriver driver = browser();
}
