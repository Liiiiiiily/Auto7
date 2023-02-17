package org.example.geekbrains.lesson345;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class cleanVersionTest {

    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
//    void test4RealYoutubeGuides() throws InterruptedException {
//        WebElement products = driver.findElement(By.id("btn-product-dropdown"));
//        products.click();
//        driver.findElement(By.linkText("Вебинары")).click();
//        List<WebElement> youtubeVideoList = driver.findElements(By.xpath("//*[@class=\"event__cta mt-auto\"]"));
//        youtubeVideoList.stream().findFirst().get().click();
//        driver.findElement(By.xpath("//*[@src=\"https://www.youtube.com/embed/rzALg1hbvW8\"]"));
//        Thread.sleep(500);
//        //        playButton.click();
//    }

    @BeforeEach
    void initDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
//        options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    void closeEyes() {
        driver.manage().deleteAllCookies();
//        window.localStorage.clear() - удаление записей из GoogleChrome
        driver.quit();
    }
}
