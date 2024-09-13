package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationAuthMethodPage;
import pages.RegistrationStepOne;
import properties.ConfigurationManager;

import static java.lang.Thread.sleep;

public class Authorization extends TestBase {
    private String mail = ConfigurationManager.configuration().e_mail();
    private String phone = ConfigurationManager.configuration().password_for_login();
    RegistrationStepOne authoPage = new RegistrationStepOne();
    RegistrationAuthMethodPage reg = new RegistrationAuthMethodPage();

    @Owner("Базорова Виктория")
    @Description("Проверка авторизации на сайте с корректными логин и паролем")
    @Test
    public void authorizationPerson() throws Exception {
        new MainPage().clickgetMoneyBTN();

        Assert.assertEquals(ConfigurationManager.configuration().reg_type(),
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");
        reg.clickRegistrationBTN();
        entranceByMail();
    }

    @Step("Заполняем форму для входа")
    public Authorization entranceByMail() throws Exception {
        authoPage.writePhoneNumber(phone).
                writeEmail(mail);
        sleep(100);
        return this;
    }
}