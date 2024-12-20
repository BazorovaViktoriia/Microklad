package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Registration_step_3_Page {

    private TextInput passportSeries = new TextInput($(By.name("passport_s")));
    private TextInput passportNumber = new TextInput($(By.name("passport_n")));
    private TextInput passportCode = new TextInput($(By.name("passport_code")));
    private TextInput passportDate = new TextInput($(By.name("passport_date")));
    private Button nextBTN = new Button($(byText("Продолжить")));

    public Registration_step_3_Page writePassportSeries(String passportSeriesStr) {
        passportSeries.sendKeys(passportSeriesStr);
        return this;
    }

    public Registration_step_3_Page writePassportNumber(String passportNumberStr) {
        passportNumber.sendKeys(passportNumberStr);
        return this;
    }

    public Registration_step_3_Page writepassportCode(String passportCodeStr) {
        passportCode.sendKeys(passportCodeStr);
        return this;
    }

    public Registration_step_3_Page writepassportDate(String passportDateStr) {
        passportDate.sendKeys(passportDateStr);
        return this;
    }

    public Registration_step_3_Page writepassportGive() {
        $(byXpath("/html/body/div[4]/div/section/div[2]/div[2]/div/div/div[2]/div[3]/input")).click();
        $(byText("ТП № 25 ОУФМС РОССИИ ПО САНКТ-ПЕТЕРБУРГУ И ЛЕНИНГРАДСКОЙ ОБЛ. В КИРОВСКОМ РАЙОНЕ Г. САНКТ-ПЕТЕРБУРГА")).click();
        return this;
    }

    public Registration_step_3_Page clickButton() {
        nextBTN.click();
        return this;
    }
}
