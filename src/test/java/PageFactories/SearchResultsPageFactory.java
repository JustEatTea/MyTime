package PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPageFactory {
    @FindBy(xpath = "//html/body/div[3]/div[4]/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/ul/li")
    public List<WebElement> listOfSearchResult;

    @FindBy(linkText = "Sophia Europa Salon")
    public WebElement salonLink;
}
