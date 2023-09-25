package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import properties.ConfigurationManager;

public class NegativeAutho extends TestBase {
    private String mail = "Привет";
    private String pass = ConfigurationManager.configuration().password_for_login();
    Authorization authorizPage = new Authorization();

    @Owner("Базорова Виктория")
    @Description(value = "Проверка авторизации на сайте с некорректным логином и корректным паролем")
    @Test
    public void authorizationPerson() throws Exception {
        authorizPage.entranceToRegistrationForm(new MainPage()).
                entranceByMail(mail, pass);

        Assert.assertEquals(ConfigurationManager.configuration().url_myAccount(),
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");
    }
}
