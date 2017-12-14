package PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPageFactory {

    @FindBy(xpath = "//html/body/div[3]/div[3]/div[2]/div/div[3]/div/div[2]/div[1]")
    public WebElement appointmentDetailsHeader;

}
