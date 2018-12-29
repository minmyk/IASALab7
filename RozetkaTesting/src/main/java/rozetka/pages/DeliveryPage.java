package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import rozetka.pageElements.Sleep;

public class DeliveryPage {

    private String url;
    private WebDriver driver;
    public static final String confirmOrederButtonXpath = "//*[@id=\"make-order\"]";


    public DeliveryPage(WebDriver driverParam){
        driver = driverParam;
        url = driver.getCurrentUrl();
    }

    public void deliveryPageWait(){
        Sleep.driverWait();
    }

    public void checkOrderButtonActive(){
        if (driver.findElement(By.xpath(confirmOrederButtonXpath)).isEnabled()){
            System.out.println("Confirm button is active");
        }
        else System.out.println("Confirm button is unactive");
    }
}
