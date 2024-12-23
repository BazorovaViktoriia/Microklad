package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import properties.ConfigurationManager;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

@Listeners(FailedWatcher.class)
public class TestBase {


    @BeforeMethod
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        addListener("AllureSelenide", new AllureSelenide());

        ChromeOptions options = new ChromeOptions();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone X");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        Configuration.browser = "Chrome";
        Configuration.browserCapabilities = options;
        Configuration.driverManagerEnabled = true;
        Configuration.holdBrowserOpen = true;
        open(ConfigurationManager.configuration().url());
    }

    public String getCookieSid() {
        Cookie cookie = WebDriverRunner.getWebDriver().manage().getCookieNamed("sid");
        return cookie.getValue();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}