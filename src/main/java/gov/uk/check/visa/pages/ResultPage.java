package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessageTourism;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement resultMessageFamilyStay;

    public String getResultMessageHealthcare(){
        return getTextFromElement(resultMessageHealthCare);
    }
    public void confirmResultHealthcare(String expectedMessage){
        Assert.assertTrue(expectedMessage.equals(getResultMessageHealthcare()));
    }
    public String getResultMessageTourism(){
        return getTextFromElement(resultMessageTourism);
    }
    public void confirmResultTourism(String expectedMessage){
        Assert.assertTrue(expectedMessage.equals(getResultMessageTourism()));
    }
    public String getResultMessageFamilyStay(){
        return getTextFromElement(resultMessageFamilyStay);
    }
    public void confirmResultFamilyStay(String expectedMessage){
        Assert.assertTrue(expectedMessage.equals(getResultMessageFamilyStay()));
    }
}
