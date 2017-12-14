package AcceptanceTests;

import PageObjects.*;
import Utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{
    @Test
    public void firstTest() throws InterruptedException {
        //1. Open the www.mytime.com home page

        driver.get("http://www.mytime.com/");
        HomePage homePage = new HomePage();

        // 2. Search for “haircut” in “seattle, wa”
        homePage.changeSearchQuery("haircut");
        homePage.changeSearchLocation("seattle, wa");
        SearchResultPage searchResultPage = homePage.clickSearchButton();

        // 3. Verify that multiple results are shown - at least 3
        int amountOfResults = searchResultPage.numberOfResults();
        Assert.assertTrue(amountOfResults>=3);

        //4. Open business with name  Salon West - (if you want you can use another business name from the list)
        //Business name - "Sophia Europa Salon"
        Assert.assertTrue(searchResultPage.isSalonPresent());
        SalonPage salonPage = searchResultPage.clickSalonLink();

        //5. On the next screen click the “Book” button for the “Haircut” service
        PickATimePage pickATimePage = salonPage.clickOnBookButton();

        // 6. Verify that the user is presented with a list of available time slots with at least 2 entries
        int amountOfTimeSlots = pickATimePage.getAmountOfTimeSlots();
        Assert.assertTrue(amountOfTimeSlots>=2);

        // 7. Choose the first time slot
        String firstAvailableTime = pickATimePage.getFirstTimeSlot();
        CheckOutPage checkOutPage = pickATimePage.clickOnFirstTimeSlot();


        // 8. Verify the appointment time on the next page matches the time selected
        String bookedTime = checkOutPage.getAppointmentTime();
        Assert.assertTrue(bookedTime.contains(firstAvailableTime));
    }


}
