package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class RegistrationStepOne
 *
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
    private TextInput passportSeria = new TextInput($(By.name("passport_s")));
    private TextInput passportNumber = new TextInput($(By.name("passport_n")));



    private TextInput firstName = new TextInput($(By.name("name_first_name")));
    private TextInput lastName = new TextInput($(By.name("name_last_name")));

    private Button neatBTN = new Button($(By.xpath("//*[@id=\"step\"]/div[3]/div[1]/div/div/div[2]/button")));

    public RegistrationStepOne writeFirstName(String str) {
        firstName.sendKeys(str);
        return this;
    }

    public RegistrationStepOne writeLastName(String lastStr) {
        lastName.sendKeys(lastStr);
        return this;
    }

    public RegistrationStepOne writePhoneNumber(String phoneNumber) {
        phone.sendKeys(phoneNumber);
        return this;
    }

    public RegistrationStepOne writeEmail(String e_mail) {
        email.sendKeys(e_mail);
        return this;
    }

    public RegistrationStepOne clickEntryButton() {
        neatBTN.click();
        return this;
    }
}