package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
   @CacheLookup
   @FindBy(xpath = "//a[normalize-space()='Start now']")
   WebElement startNowButton;

    public void clickStartNow(){
        CustomListeners.test.log(Status.PASS,"Click on Start Button"+startNowButton);
        clickOnElement(startNowButton);
    }
}
