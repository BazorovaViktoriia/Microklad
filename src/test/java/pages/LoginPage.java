package pages;

import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPage {
    TextInput tel = new TextInput($(byXpath("/html/body/div[4]/div/div[2]/div[2]/form/div/div[1]/input[1]")));
    TextInput password = new TextInput($(byXpath("/html/body/div[4]/div/div[2]/div[2]/form/div/div[1]/input[2]")));
    Button entryBtn = new Button($(byText("Войти")));

    public LoginPage writeTel(String telephone) {
        sleep(2000);
        tel.sendKeys(telephone);
        return this;
    }

    public LoginPage writePassword(String pass) {
        sleep(2000);
        password.sendKeys(pass);
        return this;
    }

    public void clickBTN() {
        entryBtn.click();
    }
}

