package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{


    LoadProp loadProp = new LoadProp();

    private By _firstName = By.cssSelector("input#FirstName");
    private By _lastName = By.cssSelector("input#LastName");
    private By _dateOFBirth = By.xpath("//select[contains(@name,'DateOfBirthDay')]");
    private By _monthOFBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.xpath("//select[contains(@name,'DateOfBirthYear')]");
    private By _emailId = By.cssSelector("input#Email");
    private By _password = By.cssSelector("input#Password");
    private By _confirmPassword = By.cssSelector("input#ConfirmPassword");
    private By _registerButton = By.cssSelector("button#register-button");

    public void enterRegistrationDetails_forNewRegistration(){

        //type first name
        typeText(_firstName,loadProp.getproperty("firstName"));

        //type last name
        typeText(_lastName,loadProp.getproperty("lastName"));

        //select DOB from dropdown
        selectElementByText(_dateOFBirth,loadProp.getproperty("date of Birth"));

        //select month of year
        selectElementByValue(_monthOFBirth,loadProp.getproperty("month of Birth"));

        //select year of birth
        selectElementByValue(_yearOfBirth,loadProp.getproperty("year of Birth"));

        //type email
        typeText(_emailId,loadProp.getproperty("email")+timeStamp()+loadProp.getproperty("email Domin"));

        //type password
        typeText(_password,loadProp.getproperty("password"));

        //confirm password
        typeText(_confirmPassword,loadProp.getproperty("confirm password"));

        //click on register button
        clickOnElement(_registerButton);

    }
    public void enterRegistrationDetails_ForAlreadyRegisteredUser(){
        //type first name
        typeText(_firstName,loadProp.getproperty("firstName"));

        //type last name
        typeText(_lastName,loadProp.getproperty("lastName"));

        //select DOB from dropdown
        selectElementByText(_dateOFBirth,loadProp.getproperty("date of Birth"));

        //select month of year
        selectElementByValue(_monthOFBirth,loadProp.getproperty("month of Birth"));

        //select year of birth
        selectElementByValue(_yearOfBirth,loadProp.getproperty("year of Birth"));

        //type email
        typeText(_emailId,loadProp.getproperty("email")+loadProp.getproperty("email Domin"));

        //type password
        typeText(_password,loadProp.getproperty("password"));

        //confirm password
        typeText(_confirmPassword,loadProp.getproperty("confirm password"));

        //click on register button
        clickOnElement(_registerButton);

    }




}
