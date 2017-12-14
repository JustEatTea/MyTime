package PageFactories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory {
    @FindBy(xpath = "//html/body/div[3]/div[5]/div[2]/div[2]/div[1]/form/div[1]/div[1]/input")
    public WebElement searchQuery;

    @FindBy(xpath = "//html/body/div[3]/div[5]/div[2]/div[2]/div[1]/form/div[1]/div[2]/input")
    public WebElement searchLocation;

    @FindBy(xpath = "//html/body/div[3]/div[5]/div[2]/div[2]/div[1]/form/div[1]/div[3]/button")
    public WebElement searchButton;

}
