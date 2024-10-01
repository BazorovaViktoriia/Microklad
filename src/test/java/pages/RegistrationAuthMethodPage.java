package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationAuthMethodPage {
    private Button registrationBTN = new Button($(By.xpath("//*[@id=\"step\"]/div[2]/div/div[2]/div[4]/div[4]/button")));

    @Step("Выбираем стандартную процедуру регистрации по паспорту")
    public RegistrationAuthMethodPage clickRegistrationBTN() {
        registrationBTN.click();
        return this;
    }
}