package PageObjects;

import PageFactories.PickATimePageFactory;
import Utils.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class PickATimePage extends BaseTest{
    private static PickATimePageFactory pickATimePageFactory = new PickATimePageFactory();

    public PickATimePage(){
        PageFactory.initElements(driver, pickATimePageFactory);
        waitForElementToLoad(pickATimePageFactory.selectButton);
    }

    public int getAmountOfTimeSlots(){
        return pickATimePageFactory.timeSlots.size();
    }

    public String getFirstTimeSlot(){
        return  pickATimePageFactory.firstTimeSlot.getText();
    }

    public CheckOutPage clickOnFirstTimeSlot(){
        pickATimePageFactory.selectButton.click();
        return new CheckOutPage();
    }
}
