package rozetka.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click {
    WebElement el;
    public Click(WebDriver driver, String xpath){
        el = driver.findElement(By.xpath(xpath));
    }

    public void click(){
        el.click();
    }
}
