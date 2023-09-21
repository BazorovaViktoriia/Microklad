package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FirstAuthorizationPage;
import pages.MainPage;
import properties.ConfigurationManager;

import static java.lang.Thread.sleep;

public class Authorization extends TestBase {
    private String mail = ConfigurationManager.configuration().e_mail();
    private String pass = ConfigurationManager.configuration().password_for_login();
    MainPage page = new MainPage();
    FirstAuthorizationPage authoPage = new FirstAuthorizationPage();

    @Test
    public void authorizationPerson() throws Exception {
        entranceToRegistrationForm().
                entranceByMail(mail, pass);
        sleep(1000);
        Assert.assertEquals(ConfigurationManager.configuration().url_myAccount(),
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");
    }

    @Step("Открываем форму для входа по e-mail зарегистрированного пользователя")
    public Authorization entranceToRegistrationForm() throws Exception {
        page.clickAuthorizationBTN();
        sleep(1000);
        Assert.assertEquals(ConfigurationManager.configuration().url_login(),
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");
        return this;
    }

    public Authorization entranceByMail(String mail_str, String str) {
        authoPage.writemail(mail_str).
                writepassword(str).
                clickEntryBTN();
        return this;
    }
}
