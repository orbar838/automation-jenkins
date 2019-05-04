package base_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static final int TIMEOUT_DEFAULT = 30;
    private static final int POLLING_DEFAULT = 100;

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver driver, int timeout, int polling){
        if (driver == null)
            throw new IllegalArgumentException("Driver object is null");

        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, timeout, polling);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public BasePage(WebDriver driver, int timeout){
        this(driver, timeout, POLLING_DEFAULT);
    }

    public BasePage(WebDriver driver){
        this(driver, TIMEOUT_DEFAULT, POLLING_DEFAULT);
    }


}
