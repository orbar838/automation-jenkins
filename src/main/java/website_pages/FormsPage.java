package website_pages;

import base_pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage {

    public FormsPage(WebDriver driver, int timeout) {
        super(driver, timeout);
    }

    @FindBy(name = "email")
    WebElement email_1st_form;

    @FindBy(name = "html5_email")
    WebElement email_2nd_form;

    
}
