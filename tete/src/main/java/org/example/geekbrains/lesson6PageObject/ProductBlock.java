package org.example.geekbrains.lesson6PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductBlock extends BaseView{
    public ProductBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//*[@href=\"https://www.mindmeister.com/pages/ru/webinars\"]")
    private WebElement webinarsSource;

    @Step("Открываем страницу с вебинарами")
    public WebinarPage clickWebinarSource() {
        webinarsSource.click();
        return new WebinarPage(driver);
    }
}
