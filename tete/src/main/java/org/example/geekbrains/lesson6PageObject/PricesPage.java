package org.example.geekbrains.lesson6PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PricesPage extends BaseView{
    public PricesPage(WebDriver driver) {
        super(driver);
    }

   @FindBy (xpath = "//*[@href=\"https://support.mindmeister.com/hc/sections/200303186-Frequently-Asked-Questions\"]")
    private WebElement oftenQuestionsLink;

    @Step("Кликаем на ссылку с частыми вопросами")
    public QuestionsPage clickOftenQuestionsLink() {
        oftenQuestionsLink.click();
        return new QuestionsPage(driver);
    }
}
