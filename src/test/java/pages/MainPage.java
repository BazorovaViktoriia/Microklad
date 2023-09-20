package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class MainPage
 *
 * Includes locators and methods for working with them
 * from the main Estelink page
 */
public class MainPage {

    WebElement registretionBTN = $(By.xpath("/html/body/div/div/header/div[1]/article/button[2]"));
    WebElement authorizationBTN = $(By.xpath("//*[@id=\"index\"]/header/div[1]/article/button[1]"));

    public void clickRegistrationBtn(){
        registretionBTN.click();
    }
    public void clickAuthorizationBTN(){ authorizationBTN.click(); }

}
