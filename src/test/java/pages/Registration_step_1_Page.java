package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class RegistrationStepOne
 * Includes person's info - passport, contact, address
 */
public class Registration_step_1_Page {

    private TextInput phone = new TextInput($(By.name("mobile_phone")));
    private TextInput email = new TextInput($(By.name("email")));

    private TextInput address = new TextInput($(By.id("address")));

    private Button nextBTN = new Button($(byText("Продолжить")));

    public Registration_step_1_Page writePhone(String phoneStr) {
        phone.sendKeys(phoneStr);
        return this;
    }

    public Registration_step_1_Page writeEmail(String emailStr) {
        email.sendKeys(emailStr);
        return this;
    }

    public Registration_step_1_Page writeaddress(String addressStr) {
        address.sendKeys(addressStr);
        return this;
    }

    public Registration_step_1_Page clickEntryButton() {
        nextBTN.click();
        return this;
    }
}