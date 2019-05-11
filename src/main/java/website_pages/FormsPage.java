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

    @FindBy(name = "pass")
    WebElement pass_1st_form;

    @FindBy(name = "html5_email")
    WebElement email_2nd_form;

    @FindBy(xpath = "//form[@name='basicForm']//input[@type='submit']")
    WebElement submitForm;

    @FindBy(xpath = "//p")
    WebElement responseP;

    public void insertToEmail(String emailAddr){
        email_1st_form.sendKeys(emailAddr);
    }

    public void insertToPAss(String pass){
        pass_1st_form.sendKeys(pass);
    }

    public void sendForm(){
        submitForm.click();
    }

    public String getResponseP(){
        return responseP.getText();
    }

}
