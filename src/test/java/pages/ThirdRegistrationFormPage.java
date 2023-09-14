package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

public class ThirdRegistrationFormPage {

    private TextInput address = new TextInput($(By.xpath("/html/body/div/section/div[1]/div[2]/div/div/div[2]/form/div/fieldset/fieldset/div[1]/div/input"))); //
    private Button entryBTN = new Button($(By.xpath("/html/body/div/section/div[1]/div[2]/div/div/div[2]/button[1]")));

    public ThirdRegistrationFormPage writeAddress(String str) {
        address.sendKeys(str);
        return this;
    }

    public ThirdRegistrationFormPage clickButton() {
        entryBTN.click();
        return this;
    }
}
