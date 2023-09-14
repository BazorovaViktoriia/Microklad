package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;

import static com.codeborne.selenide.Selenide.$;

public class ForthRegistrationFormPage {
    private Button entryBTN = new Button($(By.xpath(" /html/body/div/section/div[1]/div[2]/div/div/div[2]/button[1]")));

    public ForthRegistrationFormPage clickentryBTN() {
        entryBTN.click();
       return this;
    }
}
