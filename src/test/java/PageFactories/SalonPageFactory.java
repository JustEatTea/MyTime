package PageFactories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalonPageFactory {
    @FindBy(xpath = "//html/body/div[3]/div[4]/div[2]/div[3]/div/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div[1]")
    public WebElement bookButton;
}
