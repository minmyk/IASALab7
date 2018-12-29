package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import rozetka.pageElements.Sleep;

public class BuyPage {

    private String url;
    private WebDriver driver;

    public BuyPage(WebDriver _driver){
        driver = _driver;
        url = driver.getCurrentUrl();
    }

    public void clickBuy() {

        driver.findElement(By.name("topurchases")).click();
    }

    public void confirmBuy() {
        driver.findElement(By.xpath("//*[@id=\"popup-checkout\"]")).click();
    }

    public void buyPageWait(){
        Sleep.driverWait();
    }

}
