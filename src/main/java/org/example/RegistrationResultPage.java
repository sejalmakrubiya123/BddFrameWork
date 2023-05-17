package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils{

    LoadProp loadProp = new LoadProp();
    private By _regmsg = By.xpath("//div[@class='result']");
    public void verifyUserRegisteredSuccessfully(){
        //verify message
        String actualmessage  = getTextFromElement(_regmsg);

        //to print message
        //to verify actual and expexted results matched
        Assert.assertEquals(actualmessage,loadProp.getproperty("registration_complete _message"));
    }

}
