package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.MainPage;
import pages.FirstRegistrationFormPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class LoginPositiveTests
 *
 * Includes positive tests for authorizations
 */
public class Registration extends TestBase {

    private String first_Name = "VI";
    private String last_Name = "BazVik";
    private String phoneNumber = "+79310000000";
    private String e_mail = "forfront@mail.ru";
    private String password = "123Qwerty";



    FirstRegistrationFormPage page = new FirstRegistrationFormPage();

    @Test
    public void fillFormOfAuthorization() throws Exception {
        entranceToRegistrationForm()
                .fillPersonalInfoForm()
                .fillWorkingInformationForm();
    }

    public Registration entranceToRegistrationForm() {

        MainPage mainPage = new MainPage();
        mainPage.clickRegistrationBtn();
        $(By.xpath("/html/body/div/section/div[1]/div[2]/form")).shouldBe(visible);
        assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://dev.devselink.ru/registration", "URL не соответствует ожидаемому");
        return this;
    }


    public Registration fillPersonalInfoForm() throws Exception {
        page.writeFirstName(first_Name)
                .writeLastName(last_Name)
                .writePhoneNumber(phoneNumber)
                .writeEmail(e_mail)
                .writePassword(password)
                .confirmPassword(password)
                .clickEntryButton();

        Thread.sleep(7000);
        return this;
    }

    public Registration fillWorkingInformationForm() throws Exception {

        page.writeFirstName(first_Name)
                .writeLastName(last_Name)
                .writePhoneNumber(phoneNumber)
                .writeEmail(e_mail)
                .writePassword(password)
                .confirmPassword(password)
                .clickEntryButton();

        Thread.sleep(7000);
        return this;
    }
}
