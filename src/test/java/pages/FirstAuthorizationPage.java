package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

public class FirstAuthorizationPage {
    private TextInput mailInput = new TextInput($(By.xpath("/html/body/div/section/div[1]/div[2]/form/fieldset/fieldset[1]/fieldset/div/div/input")));
    private TextInput passwordInput = new TextInput($(By.xpath("/html/body/div/section/div[1]/div[2]/form/fieldset/fieldset[2]/fieldset/div/div[1]/input")));
    private Button entryBTN = new Button($(By.xpath("/html/body/div/section/div[1]/div[2]/form/div[2]/button")));

    public FirstAuthorizationPage writemail(String str) {
        mailInput.sendKeys(str);
        return this;
    }

    @Step("Вводим логин")
    public FirstAuthorizationPage writepassword(String str) {
        passwordInput.sendKeys(str);
        return this;
    }

    @Step("Вводим пароль")
    public FirstAuthorizationPage clickEntryBTN() {
        entryBTN.click();
        return this;
    }
}
