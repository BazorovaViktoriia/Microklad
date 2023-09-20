package tests;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import properties.ConfigurationManager;

public class NegativeAutho extends TestBase {
    private String mail = "Привет";
    private String pass = ConfigurationManager.configuration().password_for_login();
    Authorization authorizPage = new Authorization();

    @Test
    public void authorizationPerson() throws Exception {
        authorizPage.entranceToRegistrationForm().
                entranceByMail(mail, pass);

        Assert.assertEquals(ConfigurationManager.configuration().url_myAccount(),
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");
    }
}
