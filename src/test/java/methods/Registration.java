package methods;

import base.TestBase;
import io.qameta.allure.Description;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import properties.ConfigurationManager;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Registration extends TestBase {
    private String mail = ConfigurationManager.configuration().e_mail();
    private String phone = ConfigurationManager.configuration().phoneNumber();
    private String surname = ConfigurationManager.configuration().surname();
    private String name = ConfigurationManager.configuration().name();
    private String patronymic = ConfigurationManager.configuration().patronymic();
    private String birthday = ConfigurationManager.configuration().birthday();
    private String birthplace = ConfigurationManager.configuration().birthPlace();
    private String passportSeria = ConfigurationManager.configuration().passportSeria();
    private String passportNumber = ConfigurationManager.configuration().passportNumber();
    private String passportCode = ConfigurationManager.configuration().passportCode();
    private String passportDate = ConfigurationManager.configuration().passportDate();
    private String address = ConfigurationManager.configuration().address();


    @Description("Проверка регистрации на сайте")
    public void regPerson() {
        new MainPage().clickgetMoneyBTN();
        $(byText("Пройти стандартную регистрацию")).click();
        new Registration_step_1_Page()
                .writePhone(phone)
                .writeEmail(mail)
                .clickEntryButton();
        new Registration_step_2_Page()
                .writeSurname(surname)
                .writeName(name)
                .writePatronymic(patronymic)
                .writeBirthday(birthday)
                .writeBirthPlace(birthplace)
                .clickEntryButton();
        new Registration_step_3_Page()
                .writePassportSeries(passportSeria)
                .writePassportNumber(passportNumber)
                .writepassportCode(passportCode)
                .writepassportDate(passportDate)
                .writepassportGive()
                .clickButton();

        new Registration_step_4_Page()
                .writeAddress(address)
                .clickButton();


    }

        /*@Owner("Базорова Виктория")
        @Description("Проверка авторизации на сайте с корректными логин и паролем")
        @Test
        public void authorizationPerson() throws Exception {
            new MainPage().clickgetMoneyBTN();

            Assert.assertEquals(ConfigurationManager.configuration().reg_type(),
                    WebDriverRunner.getWebDriver().getCurrentUrl(),
                    "URL не соответствует ожидаемому");

            reg.clickRegistrationBTN();
            Assert.assertEquals(ConfigurationManager.configuration().reg_step1(),
                    WebDriverRunner.getWebDriver().getCurrentUrl(),
                    "URL не соответствует ожидаемому");

            step1.writePhone(phone)
                    .writeEmail(mail)
                    .writeSurname(surname)
                    .writeName(name)
                    .writePatronymic(patronymic);

        } */

    // @Step("Заполняем форму Контактные данные")
    //public Authorization entranceByMail() throws Exception {
    //  authoPage.writePhoneNumber(phone).
    //         writeEmail(mail);
    // sleep(100);
    //  return this;
    //}
}
