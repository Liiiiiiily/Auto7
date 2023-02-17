package org.example.geekbrains.lesson5GoodFourTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestForFourTests extends AbstractTest {

    public static Logger logger = LoggerFactory.getLogger(TestForFourTests.class);


    // отредактированный тест
    // 1 тест: Подтема "Полезные ссылки" в футере содержит ссылку только на русскоязычный материал

    @Test
    void test1UsefulLinks() {
        WebElement mapCatalog = driver.findElement(By.xpath("//*[@href=\"/ru/mind-map-examples\"]"));
        mapCatalog.click();

        WebElement education = getDriver().findElement(By.xpath("//*[@href=\"/ru/mind-maps/education\"]"));
        education.click();
        getDriver().close();

        getDriver().get("https://www.mindmeister.com/ru/mind-map-examples");
        WebElement blog = getDriver().findElement(By.xpath("//*[@href=\"/blog\"]"));
        blog.click();
        getDriver().get("https://www.mindmeister.com/blog");

        WebElement article = getDriver().findElement(By.xpath("//*[@href=\"https://www.mindmeister.com/blog/the-best-mind-map-templates-for-teachers-and-students/\"]"));
        article.click();
        getDriver().close();

        getDriver().get("https://www.mindmeister.com/ru/mind-map-examples");
        WebElement video = getDriver().findElement(By.xpath("//*[@href=\"http://www.youtube.com/user/MindMeister\"]"));
        video.click();
        getDriver().close();

        getDriver().get("https://www.mindmeister.com/ru/mind-map-examples");
        WebElement meisterTask = getDriver().findElement(By.xpath("//*[@href=\"https://www.meistertask.com?r_campaign=mm_integration&utm_campaign=mm_integration&utm_medium=website&utm_source=mindmeister\"]"));
        meisterTask.click();
        getDriver().close();

        getDriver().get("https://www.mindmeister.com/ru/mind-map-examples");
        WebElement meisterNote = getDriver().findElement(By.xpath("//*[@href=\"https://www.meisternote.com?utm_medium=website&utm_source=mindmeister\"]"));
        meisterNote.click();
        getDriver().close();

        getDriver().get("https://www.mindmeister.com/ru/mind-map-examples");
        WebElement mindMapsSite = getDriver().findElement(By.xpath("//*[@href=\"https://www.mindmaps.com/\"]"));
        mindMapsSite.click();

        logger.info("Ссылки актуальны!");
        getDriver().close();
    }

    // отредактированный тест
    // 2 тест: Блок "Цены" содержит несколько тарифов и список часто задаваемых вопросов

    @Test
    void test2Prices() {

        WebElement prices = getDriver().findElement(By.xpath("//*[@href=\"/ru/mind-map-pricing\"]"));
        prices.click();

        WebElement oftenQuestions = driver.findElement(By.xpath("//*[@href=\"https://support.mindmeister.com/hc/sections/200303186-Frequently-Asked-Questions\"]"));
        getDriver().findElement(By.xpath("//a[@id='cb-btn-ok']"));
        oftenQuestions.click();
        getDriver().get("https://support.mindmeister.com/hc/en-us/sections/200303186-Frequently-Asked-Questions");
//        WebElement homePageEn = AbstractTest.getDriver().findElement(By.xpath("//*[@href=\"/hc/en-us\"]"));
//        homePageEn.click();
        getDriver().close();
        logger.info("Открывается страница с разными ценами!");
    }

    // отредактированный тест
    // 3 тест: Зарегистрированный пользователь может сохранить карту другого пользователя

    @Test
    void test3SomeonesMindMaps() {
        WebElement mapCatalog = driver.findElement(By.xpath("//*[@href=\"/ru/mind-map-examples\"]"));
        mapCatalog.click();
        WebElement anyMindCap = driver.findElement(By.xpath("//*[@href=\"/ru/1122589003/the-key-components-of-knowledge-management\"]"));
        anyMindCap.click();
        WebElement copyButton = driver.findElement(By.xpath("//*[@class=\"pill-button secondary h-flex-row h-hover-shine ml-20\"]"));
        copyButton.click();
        WebElement authenticationToGoogle = driver.findElement(By.id("btn_signin_google"));
        authenticationToGoogle.click();
        copyButton.click();
        WebElement nextOkButton = driver.findElement(By.xpath("//*[@class=\"button ok_button default\"]"));
        nextOkButton.click();
        WebElement mapListing = driver.findElement(By.xpath("//*[@d=\"M10.78 12.375a1 1 0 0 1-1.56 1.25l-4-5a1 1 0 0 1 0-1.25l4-5a1 1 0 0 1 1.56 1.25L7.28 8l3.5 4.375z\"]"));
        mapListing.click();
        driver.close();
        logger.info("Чужая mind-карта отлично прижилась в личном кабинете сайта!");
    }

    // отредактированный тест
    // 4 тест: Страница вебинаров содержит действующие ссылки на Youtube-видео специалистов

    @Test
    void test4RealYoutubeGuides() {
        WebElement products = driver.findElement(By.id("btn-product-dropdown"));
        products.click();
        WebElement webinars = driver.findElement(By.linkText("Вебинары"));
        webinars.click();
        WebElement firstVideo = driver.findElement(By.xpath("//*[@href=\"https://www.mindmeister.com/pages/de/mindmeister-vr-wurzburg-webinar/\"]"));
        firstVideo.click();
        WebElement playButton = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        playButton.click();
        driver.close();
        WebElement secondVideo = driver.findElement(By.xpath("//*[@href=\"https://youtu.be/AOdK3PCfuMI\"]"));
        secondVideo.click();
        WebElement secondPlayButton = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        secondPlayButton.click();
        driver.close();
        WebElement thirdVideo = driver.findElement(By.xpath("//*[@href=\"https://vimeo.com/545102751/387ab3ff58\"]"));
        thirdVideo.click();
        WebElement thirdPlayButton = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        thirdPlayButton.click();
        driver.close();
        WebElement fourthVideo = driver.findElement(By.xpath("//*[@href=\"https://youtu.be/wJFG1GbeaAA\"]"));
        fourthVideo.click();
        WebElement fourthPlayButton = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        fourthPlayButton.click();
        driver.close();
        WebElement fifthVideo = driver.findElement(By.xpath("//*[@]href=\"https://youtu.be/KDUdYn84_30\""));
        fifthVideo.click();
        WebElement fifthPlayButton = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        fifthPlayButton.click();
        driver.close();
        WebElement sixthVideo = driver.findElement(By.xpath("//*[@]href=\"https://youtu.be/mgp20KuenE4\""));
        sixthVideo.click();
        WebElement sixthPlayButton = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        sixthPlayButton.click();
        driver.close();
        WebElement seventhVideo = driver.findElement(By.xpath("//*[@]href=\"https://youtu.be/laEjoSbO1UA\""));
        seventhVideo.click();
        WebElement seventhPlayButton = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        seventhPlayButton.click();
        driver.close();
        logger.info("Все Youtube-видео доступны для просмотра!");
    }
}
