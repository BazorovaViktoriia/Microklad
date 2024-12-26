package methods;

import base.TestBase;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;

public class UsersCookie extends TestBase {

    public static String getCookieSid() {
        Cookie cookie = WebDriverRunner.getWebDriver().manage().getCookieNamed("sid");
        return cookie.getValue();
    }

}
