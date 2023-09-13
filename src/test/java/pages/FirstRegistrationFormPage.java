package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class LoginPage
 *
 * Includes locators and methods for working with locators
 * from the page with authorizations fields
 */
public class FirstRegistrationFormPage {

    private TextInput firstName = new TextInput($(By.name("name_first_name")));
    private TextInput lastName = new TextInput($(By.name("name_last_name")));
    private TextInput phone = new TextInput($(By.name("name_phone")));
    private TextInput email = new TextInput($(By.name("name_email")));
    private TextInput password = new TextInput($(By.name("name_password")));
    private TextInput repeatPassword = new TextInput($(By.name("name_confirm_password")));

    private Button entryBTN = new Button($(By.className("entry-submit block w-full")));

    public FirstRegistrationFormPage writeFirstName(String str) {
        firstName.sendKeys(str);
        return this;
    }

    public FirstRegistrationFormPage writeLastName(String lastStr) {
        lastName.sendKeys(lastStr);
        return this;
    }

    public FirstRegistrationFormPage writePhoneNumber(String phoneNumber) {
        phone.sendKeys(phoneNumber);
        return this;
    }

    public FirstRegistrationFormPage writeEmail(String e_mail) {
        email.sendKeys(e_mail);
        return this;
    }

    public FirstRegistrationFormPage writePassword(String pass_word) {
        password.sendKeys(pass_word);
        return this;
    }

    public FirstRegistrationFormPage confirmPassword(String passwordConfirm) {
        repeatPassword.sendKeys(passwordConfirm);
        return this;
    }

    public FirstRegistrationFormPage clickEntryButton() {

        entryBTN.click();
        return this;
    }
}
