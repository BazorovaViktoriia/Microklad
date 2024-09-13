package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class MainPage
 *
 * Includes locators and methods for working with them
 * from the main microklad page
 */
public class MainPage {

    WebElement getMoneyBTN = $(By.xpath("/html/body/div[2]/div[1]/div[2]/section[1]/div[2]/div/div/form/div/button/span[1]"));


    public void clickgetMoneyBTN(){
        getMoneyBTN.click();
    }


}
