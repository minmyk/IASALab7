package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import rozetka.pageElements.Fill;
import rozetka.pageElements.Sleep;

public class LogInPage {

    private String url;
    private WebDriver driver;

    public LogInPage(WebDriver driverParam){
        driver = driverParam;
        url = driver.getCurrentUrl();
    }

    public void SetName(String name){
        Fill Name = new Fill(driver,"//*[@id=\"reciever_name\"]");
        Name.Clear();
        Name.fillForm(name);
    }

    public void SetMobile(String mobile){
        Fill Mobile = new Fill(driver,"//*[@id=\"reciever_phone\"]");
        Mobile.Clear();
        Mobile.fillForm(mobile);
    }

    public void SetMail(String mail){
        Fill Mail = new Fill(driver,"//*[@id=\"reciever_email\"]");
        Mail.Clear();
        Mail.fillForm(mail);
    }

    public void ContinuePurchase(){
        driver.findElement(By.xpath("//*[@id=\"continue_button\"]")).click();
    }

    public void Wait() {
        Sleep.driverWait();
    }
}
