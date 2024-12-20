package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;

import static com.codeborne.selenide.Selenide.$;

public class Registration_AuthMethod_Page {
    private Button registrationBTN = new Button($(By.xpath("contain")));

    @Step("Выбираем стандартную процедуру регистрации по паспорту")
    public Registration_AuthMethod_Page clickRegistrationBTN() {
        registrationBTN.click();
        return this;
    }
}