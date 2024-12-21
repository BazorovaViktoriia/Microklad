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

    WebElement getMoneyBTN = $(By.xpath("/html/body/div[4]/div/section/div[2]/form/div/div[2]/button"));


    public void clickgetMoneyBTN(){
        getMoneyBTN.click();
    }


}
