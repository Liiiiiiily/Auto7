package org.example.geekbrains.lesson6PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test6 {

    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
        //Тест 1.2: Авторизация на сайте
    void authentication() throws InterruptedException {
        driver.get("https://www.mindmeister.com/ru");
//        MainPage mainPage = new MainPage(driver);
//        mainPage.signInButton.click();
//        33-34 строки помогают найти то, что не сразу открывается на странице;
//        а может "подгрузиться" (всплывающая часть меню при наведении, например)
//        пока что единственный адекватный вариант избежать ошибок "null" здесь и внутри MainPage -
//        каждый нововсплывающий элемент заново объявлять такими строками, как выше.

//        new MainPage(driver).closeNotificationBanner.click();
//        new MainPage(driver).cookieOkButton.click();
        new MainPage(driver)
                .clickSignInButton()
                .login("tea.egorova@gmail.com", "05031998Xd");
        Thread.sleep(10000);
    }

    @Test
        //Тест 2.2: Наведение по лого со страницы авторизации даёт справку с названием ресурса
    void logoToStartWithAuthentication() throws InterruptedException {
        authentication();
        new MyAccountPage(driver).hoverLogoButton();
        Thread.sleep(5000);
    }

    @Test
        //Тест 3.2: Блок "Цены" содержит несколько тарифов и кликабельную ссылку на список часто задаваемых вопросов
    void pricesAndQuestions() throws InterruptedException {
        driver.get("https://www.mindmeister.com/ru");
        new MainPage(driver)
                .clickPriceInformationMap()
                .clickOftenQuestionsLink();
        Thread.sleep(10000);
    }

    @Test
    //Тест 4.2.:  Страница вебинаров содержит действующие ссылки на Youtube-видео специалистов
    void realWebinars() throws InterruptedException {
        driver.get("https://www.mindmeister.com/ru");
        MainPage mainPage = new MainPage(driver);
        mainPage.cookieOkButton.click();
        WebElement menuOpener = driver.findElement(By.xpath(".//*[@id=\"menu-opener\"]"));
        menuOpener.click();
        new MainPage(driver)
//              .goToProduct()
                .clickCookies()
                .clickProductButton()
                .clickWebinarSource()
                .testEachWebinar(); //возьмём только один вебинар
        Thread.sleep(10000);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
