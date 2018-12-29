package rozetka.item;

import org.openqa.selenium.WebDriver;
import rozetka.pages.MainPage;

public class SearchItem {

    MainPage mainPage;

    public SearchItem(WebDriver driverParam){
        this.mainPage = new MainPage(driverParam);
    }

    public void executeSearch(Integer minPrice, Integer maxPrice){
        mainPage.rozetkaWait();
        mainPage.submitDistrib();

        mainPage.rozetkaWait();
        mainPage.enterMaxPrice(maxPrice);
        mainPage.enterMinPrice(minPrice);
        mainPage.rozetkaWait();
        mainPage.submitPrice();
        mainPage.rozetkaWait();

        mainPage.goByUrl(mainPage.SearchGoods().get(0));
    }

    public WebDriver getDriver(){
        return this.mainPage.getDriver();
    }

}
