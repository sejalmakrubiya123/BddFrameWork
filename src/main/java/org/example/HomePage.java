package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils{

    private By _registerButton = By.cssSelector("a.ico-register");
    private By _buildYourOwnComputer = By.xpath("//a[text()='Build your own computer']");
    private By _loginButton = By.xpath("//a[text()='Log in' ]");

    LoadProp loadProp = new LoadProp();
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnBuildYourOwnComputer(){

        //click on build your own computer
        clickOnElement(_buildYourOwnComputer);
    }
    public void clickOnLoginButton(){
        //click on login button
        clickOnElement(_loginButton);
    }
    public void verifyHomepage(){
        String homepageURL = getCurrentURL();

        Assert.assertEquals(homepageURL,loadProp.getproperty("url"));
    }


}
