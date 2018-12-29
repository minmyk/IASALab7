import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import rozetka.item.SearchItem;
import rozetka.item.BuyItem;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/mykyta/geckodriver");
        WebDriver driver = new FirefoxDriver();
        SearchItem item = new SearchItem(driver);
        item.executeSearch(200,2000);
        BuyItem buyItem = new BuyItem(item.getDriver());
        buyItem.executeBuy("Имя Фамилия","+380677666666","example@gmail.com");
        driver.close();
    }
}