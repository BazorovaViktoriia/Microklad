package pages;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class MainPage
 * <p>
 * Главная страница microklad.ru
 * С этой страницы используются локаторы для авторизации в ЛК и прохождения регистрации
 */
public class MainPage {

    private WebElement getMoneyBTN = $(By.xpath("/html/body/div[4]/div/section/div[2]/form/div/div[2]/button"));
    private WebElement loginLK = $(byText("Войти в личный кабинет"));

    public void clickGetMoneyBTN() {
        getMoneyBTN.click();
    }

    @Step("Нажимаем кнопку для перехода в ЛК")
    public void login() {
        loginLK.click();
    }

    @Step("Пролистываем страницу до появления кнопки 'Войти в ЛК' ")
    public void scrollDown(int pixels) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        jsExecutor.executeScript("window.scrollBy(0, arguments[0]);", pixels);
    }
}