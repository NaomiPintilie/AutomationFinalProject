package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class Base {
    public WebDriver driver;
    //public Properties property;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.support.hp.com/ro-en");
        // browser mare(full screen)
        driver.manage().window().maximize();
    }
//
//    @After
//    public void teardDown(){
//        driver.quit();
//    }
}