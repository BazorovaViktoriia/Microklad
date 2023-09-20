package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;
import properties.ConfigurationManager;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class Registration extends TestBase {

    private String first_Name = ConfigurationManager.configuration().first_Name();
    private String last_Name = ConfigurationManager.configuration().last_Name();
    private String phoneNumber = ConfigurationManager.configuration().phoneNumber();
    private String e_mail = ConfigurationManager.configuration().e_mail();
    private String password = ConfigurationManager.configuration().password_for_login();

    private String companyName = ConfigurationManager.configuration().companyName();

    private String address = ConfigurationManager.configuration().address();

    FirstRegistrationFormPage pageFirst = new FirstRegistrationFormPage();
    SecondRegistrationFormPage pageSecond = new SecondRegistrationFormPage();
    ThirdRegistrationFormPage pageThird = new ThirdRegistrationFormPage();
    ForthRegistrationFormPage pageForth = new ForthRegistrationFormPage();

    @Test
    public void registrationCompany() throws Exception {
        entranceToRegistrationForm()
                .fillPersonalInfoForm()
                .fillWorkingInformationForm()
                .writeAddress()
                .choiсeTheme();

        assertEquals(ConfigurationManager.configuration().url_myAccount(),
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");
    }

    public Registration entranceToRegistrationForm() {
        MainPage mainPage = new MainPage();
        mainPage.clickRegistrationBtn();
        $(By.xpath("/html/body/div/section/div[1]/div[2]/form")).shouldBe(visible);
        assertEquals(ConfigurationManager.configuration().url_registration(),
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");

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

        Thread.sleep(4000);
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
