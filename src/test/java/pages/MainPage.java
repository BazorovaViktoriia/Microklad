package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Class MainPage
 * <p>
 * Includes locators and methods for working with them
 * from the main microklad page
 */
public class MainPage {

    WebElement getMoneyBTN = $(By.xpath("/html/body/div[4]/div/section/div[2]/form/div/div[2]/button"));
    WebElement loginLK = $(byXpath("/html/body/div[4]/div/section/div[2]/div[4]/div/div/form/button"));

    public void clickGetMoneyBTN() {
        getMoneyBTN.click();
    }

    public void login() throws InterruptedException{
        sleep(3000);
        loginLK.click();
    }
}