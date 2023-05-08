package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonDurationPage;

    public void selectLengthOfStay(String moreOrLess){
        switch (moreOrLess){
            case "6 months or less": clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months": clickOnElement(moreThanSixMonths);
                break;
            default:break;
        }
        CustomListeners.test.log(Status.PASS, "selectLengthStay" + moreOrLess);
    }

    public void clickNextStepButton(){
        clickOnElement(continueButtonDurationPage);
        CustomListeners.test.log(Status.PASS, "clickOnNextStepButton" + continueButtonDurationPage);
    }
}
