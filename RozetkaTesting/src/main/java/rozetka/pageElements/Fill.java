package rozetka.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fill {
    WebElement el;

    public Fill(WebDriver driver, String xpath){
        this.el = driver.findElement(By.xpath(xpath));
    }

    public void fillForm(String info){
        el.sendKeys(info);
    }

    public void Clear() {
        el.sendKeys(Keys.CONTROL + "a");
        el.sendKeys(Keys.DELETE);
    }

}
