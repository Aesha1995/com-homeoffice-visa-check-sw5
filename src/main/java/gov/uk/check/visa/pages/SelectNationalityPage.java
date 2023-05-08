package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement nextStepButtonAcceptAdditional;

    public void selectNationality(String nationality){
        CustomListeners.test.log(Status.PASS,"Select Nationality from DropDownList"+nationalityDropDownList);
        clickOnElement(nextStepButtonAcceptAdditional);
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    public void clickNextStepButton(){
        CustomListeners.test.log(Status.PASS,"Click on Continue Button"+nextStepButton);
        clickOnElement(nextStepButton);
    }
}
