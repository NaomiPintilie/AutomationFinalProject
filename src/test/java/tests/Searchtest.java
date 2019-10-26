package tests;


import framework.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;

public class Searchtest extends Base {
    // @Test
    //validare pagina
    // String expectednamevalue = "HP Support for Technical Help and Troubleshooting | HP® Customer Service.";
    //String actualnamevalue = driver.getTitle();
    // Assert.assertEquals(expectednamevalue, actualnamevalue);


    @Test
    public void search() {
        //validare pagina
        String expectednamevalue = "HP Support for Technical Help and Troubleshooting | HP® Customer Service.";
        String actualnamevalue = driver.getTitle();
        assertEquals(expectednamevalue, actualnamevalue);
        // scrolldown
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");

        //click pe printer
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement printer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='printer']")));
        printer.click();
        jse.executeScript("window.scrollBy(0,-500)");

        //cautare dupa un cuvant cheie
        WebElement searchkeyWeb = driver.findElement(By.id("search_widget"));
        //String searchkeyValue = "Imprimante Samsung";
        searchkeyWeb.click();

        WebElement searchFieldSectionWeb = driver.findElement(By.xpath("//div[@class='search_mob_container hf_clf placeholder_wrapper']/input"));
        Actions action = new Actions(driver);
        action.moveToElement(searchFieldSectionWeb).build().perform();
        searchFieldSectionWeb.sendKeys("Imprimante Samsung");
        searchFieldSectionWeb.sendKeys(Keys.ENTER);
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body']/div/div[2]/div[2]/div/div/p")));
    }

}

