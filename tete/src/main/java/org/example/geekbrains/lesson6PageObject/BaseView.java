package org.example.geekbrains.lesson6PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseView {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    public BaseView(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 5);
        // (Duration.ofSeconds()); -> https://stackoverflow.com/questions/58993667/webdriverwait-is-deprecated-in-selenium-4
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
}
