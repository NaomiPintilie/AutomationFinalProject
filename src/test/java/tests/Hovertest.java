package tests;

import framework.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovertest extends Base {

    @Test
    public void Hoverwaittest() {
        //hover 4 - hover la un SwitchElement
        WebElement switchtoWeb = driver.findElement(By.xpath("//input[@placeholder='Example: HU265BM18V, LaserJet Pro P1102w']"));
        Actions action = new Actions(driver);
        action.moveToElement(switchtoWeb).build().perform();

    }
}
