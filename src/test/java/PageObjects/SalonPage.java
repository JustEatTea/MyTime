package PageObjects;

import PageFactories.SalonPageFactory;
import Utils.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class SalonPage extends BaseTest {
    private static SalonPageFactory salonPageFactory = new SalonPageFactory();

    public SalonPage(){
        PageFactory.initElements(driver, salonPageFactory);
        waitForElementToLoad(salonPageFactory.bookButton);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public PickATimePage clickOnBookButton(){
        salonPageFactory.bookButton.click();
        return new PickATimePage();
    }
}
