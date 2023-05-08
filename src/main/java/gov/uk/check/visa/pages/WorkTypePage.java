package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthCareProfessional;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement DigitalTechnologyProfessional;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement AcademicOrRsearcher;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement WorkInArtsOrCulture;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement ProfessionalSportsperson;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement ReligiousWorker;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement IWantToStartABusiness;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement IWantToDoAnotherTypeOfJobShowMeOtherWorkVisas;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectJobType(String job){
        CustomListeners.test.log(Status.PASS, "clickOnSelectReasonForVisit" + job);
        switch (job)
        {
            case "Health and care professional" : clickOnElement(healthCareProfessional);
                break;
            case "Digital technology professional" : clickOnElement(DigitalTechnologyProfessional);
                break;
            case "Academic or researcher" : clickOnElement(AcademicOrRsearcher);
                break;
            case "Work in arts or culture" : clickOnElement(WorkInArtsOrCulture);
                break;
            case "Professional sportsperson": clickOnElement(ProfessionalSportsperson);
                break;
            case "Religious worker": clickOnElement(ReligiousWorker);
                break;
            case "I want to start a business": clickOnElement(IWantToStartABusiness);
                break;
            case "I want to do another type of job - show me other work visas": clickOnElement(IWantToDoAnotherTypeOfJobShowMeOtherWorkVisas);
                break;
        }
    }

    public void clickOnContinueButton(){
        CustomListeners.test.log(Status.PASS, "clickOnSelectReasonForVisit" + continueButton);
        clickOnElement(continueButton);
    }
}
