package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends Utils{

    LoadProp loadProp = new LoadProp();
    private By _enterFriendEmail = By.xpath("//input[contains(@class,'friend-email')]");
    private By _enterPersonalMessage = By.xpath("//textarea[contains(@name,'PersonalMessage')]");
    private By _sendEmailButton = By.xpath("//button[text()='Send email']");
    private By _sendEmailMessage = By.xpath("//div[@class='result']");
    private By _enterYourEmailId = By.id("YourEmailAddress");
    private By _emailAFriendButton = By.xpath("//button[text()='Email a friend']");
    public void emailAFriend_BuildYourOwnComputer() {
        //click on email friend button
        clickOnElement(_emailAFriendButton);
    }
    public void enterInEmailAfriendDetails() {

        //type friend's email
        typeText(_enterFriendEmail, loadProp.getproperty("friend Email") + loadProp.getproperty("email Domin"));

        //type personal message
        typeText(_enterPersonalMessage, loadProp.getproperty("personal Message"));
    }
    public void clickOnSendEmailButton() {

        //click on Send Email button
        clickOnElement(_sendEmailButton);
    }
    public void sendEmailSuccessMessage(){

        String actualmessage = getTextFromElement(_sendEmailMessage);

        //to print sent message
        System.out.println("my message: " +actualmessage);

        Assert.assertEquals(actualmessage,loadProp.getproperty("sent Email Message"));


    }
    public void verifyProductPage(){
        String productpageURL = getCurrentURL();

        Assert.assertEquals(productpageURL,loadProp.getproperty("productpage URL"));
    }
    public void verifyEmailAFriendPage(){
        String emailAFriendPageURL=getCurrentURL();

        Assert.assertEquals(emailAFriendPageURL,loadProp.getproperty("emailAfriendpage URL"));

    }


}


