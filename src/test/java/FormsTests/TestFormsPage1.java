package FormsTests;

import base_tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import website_pages.FormsPage;

public class TestFormsPage1 extends BaseTest {
    FormsPage formsPage;
    private static String EMAIL = "sdgg@dfg.dgf";

    @BeforeClass
    public void BeforeClass(){
        formsPage = new FormsPage(getDriver(), 30);
        getDriver().get("localhost:8081");
    }

    @Test
    public void Test1(){
        formsPage.insertToEmail(EMAIL);
        formsPage.insertToPAss("1234");
        formsPage.sendForm();
        Assert.assertEquals(formsPage.getResponseP(), "Thanks " + EMAIL + " !");
    }

}
