package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement title;

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementVisible(title);
        return this;
    }

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }
}