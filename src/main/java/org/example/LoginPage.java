package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

        private By _email = By.cssSelector("input.email");
        private By _password = By.id("password");
        private By _loginButton =By.xpath("//button[text()='Log in']");

        LoadProp loadProp = new LoadProp();
        public  void  enterLoginDetails(){

            //type email
            typeText(_email,loadProp.getproperty("email")+loadProp.getproperty("email_Domain"));

            //type password
            typeText(_password,loadProp.getproperty("password"));

            //click on login button
            clickOnElement(_loginButton);
        }

}
