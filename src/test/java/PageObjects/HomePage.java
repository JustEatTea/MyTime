package PageObjects;

import PageFactories.HomePageFactory;
import Utils.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    private static HomePageFactory homePageFactory = new HomePageFactory();

    public HomePage(){
        PageFactory.initElements(driver, homePageFactory);
        waitForElementToLoad(homePageFactory.searchButton);
    }

    public void changeSearchQuery(String newName){
        homePageFactory.searchQuery.clear();
        homePageFactory.searchQuery.sendKeys(newName);
    }

    public void changeSearchLocation(String newLocation){
        homePageFactory.searchLocation.clear();
        homePageFactory.searchLocation.sendKeys(newLocation);
    }

    public SearchResultPage clickSearchButton(){
        homePageFactory.searchButton.click();
        return new SearchResultPage();
    }



}
