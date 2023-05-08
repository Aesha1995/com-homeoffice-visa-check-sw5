package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement no;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectImmigrationStatusPage(String status){
        CustomListeners.test.log(Status.PASS,"Select YES or NO");
        switch (status){
            case "yes" : clickOnElement(yes);
            break;
            case "no" : clickOnElement(no);
            break;
        }
    }
    public void clickOnNextStepButton(){
        CustomListeners.test.log(Status.PASS,"Click on Continue Button"+nextStepButton);
        clickOnElement(nextStepButton);
    }

}
