package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

public class SecondRegistrationFormPage {

    private TextInput companyName = new TextInput($(By.xpath("//*[@id=\"app\"]/section/div[1]/div[2]/div/div/div[2]/form/div/fieldset/fieldset/div/div/input"))); //
    private Button activityBtn = new Button($(By.xpath("/html/body/div/section/div[1]/div[2]/div/div/div[2]/form/div/div[2]/div/button[8]"))); // не сделано, можно закрыть форму не вводя должность

    private Button buttonNext = new Button($(By.xpath("/html/body/div/section/div[1]/div[2]/div/div/div[2]/button[1]")));  // кнопка для выбора деятельности во второй форме

    public SecondRegistrationFormPage writeCompanyName(String str) {
        companyName.sendKeys(str);
        return this;
    }

    public SecondRegistrationFormPage clickBtnSelectActivity() {
        activityBtn.click();
        return this;
    }

    public SecondRegistrationFormPage clickBTNNext() {
        buttonNext.click();
        return this;
    }

}
