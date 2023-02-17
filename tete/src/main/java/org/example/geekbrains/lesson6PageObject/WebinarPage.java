package org.example.geekbrains.lesson6PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebinarPage extends BaseView{
    public WebinarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@class=\"event__main\"]")
    public List<WebElement> webinars;

    @Step("Прожимаем каждый вебинар по порядку")
    public WebinarPage testEachWebinar() throws InterruptedException {
        for( int i = 0; i < 4; i++) {
            System.out.printf("Pressing %d element of collection\n", i);
            webinars.get(i).click();
            Thread.sleep(3000);
        }
        return this;
    }

//   найти красную кнопку
//   нажать на краскую кнопку
//   закрыть вебинар

//     webinars.stream().filter().findFirst().get().click();
}
