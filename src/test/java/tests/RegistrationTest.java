package tests;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import methods.Registration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends Registration {

    @Owner("Базорова Виктория")
    @Description("Проверка регистрации на сайте")
    @Test
    public void RegPersonTest() {
        new Registration().regPerson();

        Assert.assertEquals("https://shigapova.microklad.ru/registration/step/4",
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "URL не соответствует ожидаемому");
    }

    // @Step("Заполняем форму Контактные данные")
    //public Authorization entranceByMail() throws Exception {
    //  authoPage.writePhoneNumber(phone).
    //         writeEmail(mail);
    // sleep(100);
    //  return this;
    //}
}