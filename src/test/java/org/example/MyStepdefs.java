package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ProductPage productPage = new ProductPage();
    LoginPage loginPage = new LoginPage();


    @Given("I am on registration page")
    public void i_am_on_registration_page(){
        homePage.clickOnRegisterButton();
    }


    @When("I enter required registration details")
    public  void  i_enter_required_registration_details(){

          registerPage.enterRegistrationDetails_forNewRegistration();
    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully(){

        registrationResultPage.verifyUserRegisteredSuccessfully();
    }
    @Given("I am a registered user")
    public void i_am_a_registered_user(){
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails_ForAlreadyRegisteredUser();
    }

    @Given("I Log in into my account")
    public void i_log_in_into_my_account(){
        homePage.clickOnLoginButton();
        loginPage.enterLoginDetails();
    }
    @Given("I am on homepage")
    public void i_am_on_homepage(){
        homePage.verifyHomepage();
    }

    @When("I click on Build your own computer")
        public void i_click_on_build_your_own_computer(){
               homePage.clickOnBuildYourOwnComputer();

    }
    @When("I am on product page")
         public void i_am_on_product_page(){
               productPage.verifyProductPage();
    }
    @When("I clck on Email a friend button")
    public void i_click_on_email_a_friend_button(){
         productPage.emailAFriend_BuildYourOwnComputer();


    }

    @Then("Email a friend page should appear")
        public void email_a_friend_page_should_appear(){
           productPage.verifyEmailAFriendPage();

    }
    @Then("I enter required Email a friend details")
    public void i_enter_required_email_a_friend_details() {
        productPage.enterInEmailAfriendDetails();

    }
    @Then("I click on send email button")
    public void i_click_on_send_email_button() {
        productPage.clickOnSendEmailButton();

    }
    @Then("{string} should be seen successfully.")
    public void should_be_seen_successfully(String string) {
        productPage.sendEmailSuccessMessage();

    }

}




