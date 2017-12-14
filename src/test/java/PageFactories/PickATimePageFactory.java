package PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PickATimePageFactory {
    @FindBy(xpath = "//html/body/div[3]/div[2]/div[2]/div[4]/div[4]/div[2]/div/div[3]/ul/li")
    public List<WebElement> timeSlots;

    @FindBy(xpath = "//html/body/div[3]/div[2]/div[2]/div[4]/div[4]/div[2]/div/div[3]/ul/li[1]/span[1]")
    public WebElement firstTimeSlot;

    @FindBy(xpath = "//html/body/div[3]/div[2]/div[2]/div[4]/div[4]/div[2]/div/div[3]/ul/li[1]/span[2]/span[3]")
    public WebElement selectButton;


}
