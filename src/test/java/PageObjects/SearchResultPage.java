package PageObjects;

import PageFactories.SearchResultsPageFactory;
import Utils.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseTest {
    private static SearchResultsPageFactory searchResultsPageFactory = new SearchResultsPageFactory();

    public SearchResultPage(){
        PageFactory.initElements(driver, searchResultsPageFactory);
        waitForElementToLoad(searchResultsPageFactory.salonLink);
    }

    public int numberOfResults(){
        return searchResultsPageFactory.listOfSearchResult.size();
    }

    public boolean isSalonPresent(){
        for(WebElement element:searchResultsPageFactory.listOfSearchResult){
            if(element.getText().contains("Sophia Europa Salon")){
                return true;
            }
        }
        return false;
    }

    public SalonPage clickSalonLink(){
        searchResultsPageFactory.salonLink.click();
        return new SalonPage();
    }
}
