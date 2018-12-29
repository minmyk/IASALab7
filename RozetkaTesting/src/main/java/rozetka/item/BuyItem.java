package rozetka.item;

import org.openqa.selenium.WebDriver;
import rozetka.pages.BuyPage;
import rozetka.pages.LogInPage;
import rozetka.pages.DeliveryPage;

public class BuyItem {

    WebDriver driver;

    public BuyItem(WebDriver driver){
        this.driver = driver;
    }

    public void executeBuy(String name, String mobile, String email){
        BuyPage page = new BuyPage(driver);
        page.buyPageWait();
        page.clickBuy();
        page.buyPageWait();
        page.confirmBuy();
        page.buyPageWait();

        LogInPage logInPage = new LogInPage(driver);
        logInPage.Wait();
        logInPage.SetName(name);
        logInPage.SetMobile(mobile);
        logInPage.SetMail(email);
        logInPage.Wait();
        logInPage.ContinuePurchase();
        logInPage.Wait();

        DeliveryPage deliveryPage = new DeliveryPage(driver);
        deliveryPage.deliveryPageWait();
        deliveryPage.checkOrderButtonActive();
    }

}
