package base_tests;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        if (driver != null){
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
