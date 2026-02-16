package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement yallaButton;


    @FindBy(xpath = "//h2[@class='message']")
    WebElement message;

    public LoginPage enterData(String email, String password) {
        type(emailField, email);
        type(passwordField, password);
        return this;
    }

    public void clickOnYallaButton() {
        click(yallaButton);
    }


    public void verifyMessage(String text) {

        assert message.getText().contains(text);
    }
}