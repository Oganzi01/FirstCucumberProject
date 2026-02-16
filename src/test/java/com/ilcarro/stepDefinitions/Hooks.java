package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.BasePage;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown() {
        if (BasePage.driver != null) {
            BasePage.driver.quit(); // Вот эта команда закрывает браузер
        }
    }
}
