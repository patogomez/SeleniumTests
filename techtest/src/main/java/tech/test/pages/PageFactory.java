package tech.test.pages;

import org.openqa.selenium.WebDriver;


/**
 * PageFactory that is used to instantiate desired page object
 */
public class PageFactory {

    private final WebDriver webDriver;

    public PageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public GooglePage newGooglePage() {
        return new GooglePage(webDriver);
    }

}
