package clients_module;

import base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;
import pages.MainPage;
import properties.ConfigurationManager;
import tests.Authorization;

import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class SourceOfAttractionTests extends TestBase {
    private String mail = ConfigurationManager.configuration().e_mail();
    private String pass = ConfigurationManager.configuration().password_for_login();
    private String sourceName = ConfigurationManager.configuration().sourceName();
    private String sourceUTM = ConfigurationManager.configuration().sourceUTM();
    Authorization autho = new Authorization();
    SourcesPage sources = new SourcesPage();


}
