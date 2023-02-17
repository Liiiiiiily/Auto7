package org.example.geekbrains.lesson5GoodFourTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//Автоматизируйте основные проверки.

public abstract class AbstractTest {

    public static WebDriver driver;

    @BeforeEach
    void startTo() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
//        options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://www.mindmeister.com/ru"), "Страница недоступна");
        closeCookie();
    }

    private void closeCookie() {
        WebElement closeCookie = AbstractTest.getDriver().findElement(By.xpath("//a[@id='cb-btn-ok']"));
        closeCookie.click();
    }

    @AfterEach
    void close() {
        WebElement closeCookie = (new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='cb-btn-ok']"))));
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
