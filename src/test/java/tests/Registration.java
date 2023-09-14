package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class Registration
 * <p>
 * Includes positive tests for authorizations
 */
public class Registration extends TestBase {

    private String first_Name = "VI";
    private String last_Name = "BazVik";
    private String phoneNumber = "+79310000000";
    private String e_mail = "forfront@mail.ru";
    private String password = "123Qwerty";

    private String companyName = "Estelink";

    private String address = "Санкт-Петербург, Московский пр-кт, д17";

    FirstRegistrationFormPage pageFirst = new FirstRegistrationFormPage();
    SecondRegistrationFormPage pageSecond = new SecondRegistrationFormPage();
    ThirdRegistrationFormPage pageThird = new ThirdRegistrationFormPage();
    ForthRegistrationFormPage pageForth = new ForthRegistrationFormPage();

    @Test
    public void fillFormOfAuthorization() throws Exception {
        entranceToRegistrationForm()
                .fillPersonalInfoForm()
                .fillWorkingInformationForm()
                .writeAddress()
                .choiсeTheme();

        assertEquals("https://dev.devselink.ru/myAccount", WebDriverRunner.getWebDriver().getCurrentUrl(), "URL не соответствует ожидаемому");
    }

    public Registration entranceToRegistrationForm() {
        MainPage mainPage = new MainPage();
        mainPage.clickRegistrationBtn();
        $(By.xpath("/html/body/div/section/div[1]/div[2]/form")).shouldBe(visible);
        assertEquals("https://dev.devselink.ru/registration", WebDriverRunner.getWebDriver().getCurrentUrl(), "URL не соответствует ожидаемому");

        return this;
    }

    public Registration fillPersonalInfoForm() throws Exception {
        pageFirst.writeFirstName(first_Name)
                .writeLastName(last_Name)
                .writePhoneNumber(phoneNumber)
                .writeEmail(e_mail)
                .writePassword(password)
                .confirmPassword(password);

        Thread.sleep(7000);
        pageFirst.clickEntryButton();
        return this;
    }

    public Registration fillWorkingInformationForm() throws Exception {
        pageSecond.writeCompanyName(companyName)
                .clickBtnSelectActivity();

        Thread.sleep(7000);
        pageSecond.clickBTNNext();
        return this;
    }

    public Registration writeAddress() throws Exception {
        Thread.sleep(7000);
        pageThird.clickButton();
        return this;
    }

    public Registration choiсeTheme() throws Exception {
        Thread.sleep(7000);
        pageForth.clickentryBTN();
        return this;
    }
}
