package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class RegistrationStepOne
 * Includes person's info - passport, contact, address
 */
public class RegistrationStepOne {

    private TextInput phone = new TextInput($(By.id("mobile_phone")));
    private TextInput email = new TextInput($(By.id("email")));
    private TextInput surname = new TextInput($(By.name("name1")));
    private TextInput name = new TextInput($(By.name("name2")));
    private TextInput patronymic = new TextInput($(By.name("name3")));
    private TextInput birthday = new TextInput($(By.name("birthday")));
    private TextInput birthPlace = new TextInput($(By.name("birth_place")));
    private TextInput passportSeries = new TextInput($(By.name("passport_s")));
    private TextInput passportNumber = new TextInput($(By.name("passport_n")));
    private TextInput passportCode = new TextInput($(By.name("passport_code")));
    private TextInput passportDate = new TextInput($(By.name("passport_date")));
    private TextInput address = new TextInput($(By.id("address")));

    private Button nextBTN = new Button($(By.className("btn full")));

    public RegistrationStepOne writePhone(String phoneStr) {
        phone.sendKeys(phoneStr);
        return this;
    }

    public RegistrationStepOne writeEmail(String emailStr) {
        email.sendKeys(emailStr);
        return this;
    }

    public RegistrationStepOne writeSurname(String surnameStr) {
        surname.sendKeys(surnameStr);
        return this;
    }

    public RegistrationStepOne writeName(String nameStr) {
        name.sendKeys(nameStr);
        return this;
    }

    public RegistrationStepOne writePatronymic(String patronymicStr) {
        patronymic.sendKeys(patronymicStr);
        return this;
    }

    public RegistrationStepOne writeBirthday(String birthdayStr) {
        birthday.sendKeys(birthdayStr);
        return this;
    }

    public RegistrationStepOne writeBirthPlace(String birthPlaceStr) {
        birthPlace.sendKeys(birthPlaceStr);
        return this;
    }

    public RegistrationStepOne writePassportSeries(String passportSeriesStr) {
        passportSeries.sendKeys(passportSeriesStr);
        return this;
    }

    public RegistrationStepOne writePassportNumber(String passportNumberStr) {
        passportNumber.sendKeys(passportNumberStr);
        return this;
    }

    public RegistrationStepOne writepassportCode(String passportCodeStr) {
        passportCode.sendKeys(passportCodeStr);
        return this;
    }

    public RegistrationStepOne writepassportDate(String passportDateStr) {
        passportDate.sendKeys(passportDateStr);
        return this;
    }

    public RegistrationStepOne writeaddress(String addressStr) {
        address.sendKeys(addressStr);
        return this;
    }

    public RegistrationStepOne clickEntryButton() {
        nextBTN.click();
        return this;
    }
}