package PageObjects;

import PageFactories.CheckOutPageFactory;
import Utils.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BaseTest {
    private static CheckOutPageFactory checkOutPageFactory = new CheckOutPageFactory();

    public CheckOutPage(){
        PageFactory.initElements(driver, checkOutPageFactory);
        waitForElementToLoad(checkOutPageFactory.appointmentDetailsHeader);
    }

    public String getAppointmentTime(){
        return checkOutPageFactory.appointmentDetailsHeader.getText();
    }
}
