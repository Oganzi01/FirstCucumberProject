package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    LoginPage login;

    @And("User clicks on Login link")
    public void click_on_login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters correct data")
    public void enter_correct_data() {
        login = new LoginPage(driver);
        login.enterData("manuel@gm.com", "Manuel1234!");
    }

    @And("User clicks on Yalla button")
    public void click_on_yalla_button() {
        login.clickOnYallaButton();
    }

    @Then("User verifies Success message is displayed")
    public void verify_success_login() {
        login.verifyMessage("Logged in success");
    }
}