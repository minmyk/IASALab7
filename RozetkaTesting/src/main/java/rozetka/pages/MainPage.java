package rozetka.pages;

import rozetka.pageElements.Click;
import rozetka.pageElements.Fill;
import rozetka.pageElements.Sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    public static final String url = "https://rozetka.com.ua/kabelno-provodnikovaya-produkciya/c3803617/";
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.driver.get(url);

    }

    public void enterMinPrice(Integer minPrice){
        Fill Min = new Fill(driver,"//*[@id=\"price[min]\"]");
        Min.Clear();
        Min.fillForm(minPrice.toString());
    }

    public void enterMaxPrice(Integer maxPrice){
        Fill Max = new Fill(driver,"//*[@id=\"price[max]\"]");
        Max.Clear();
        Max.fillForm(maxPrice.toString());
    }

    public void submitPrice(){driver.findElement(By.xpath("//*[@id=\"submitprice\"]")).click();}

    public void submitDistrib(){
        new Click(driver,"//*[@id=\"filter_strana-proizvoditelj-tovara-2577232_620897\"]").click();
    }

    public ArrayList<String> SearchGoods(){
        List<WebElement> Goods = driver.findElements(By.xpath("//*[@class='g-i-tile-i-title clearfix']/a"));
        ArrayList<String> Hrefs = new ArrayList<String>();
        for (WebElement el : Goods) {
            Hrefs.add(el.getAttribute("href"));
        }
        return Hrefs;
    }

    public void goByUrl(String url){
        driver.get(url);
    }

    public void rozetkaWait() {
        Sleep.driverWait();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
