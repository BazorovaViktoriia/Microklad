package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Registration_step_2_Page {

    private TextInput surname = new TextInput($(By.id("field_surname")));
    private TextInput name = new TextInput($(By.id("field_name")));
    private TextInput patronymic = new TextInput($(By.id("field_patronymic")));
    private TextInput birthday = new TextInput($(By.name("birthday")));
    private TextInput birthPlace = new TextInput($(By.name("birth_place")));
    private Button nextBTN = new Button($(byText("Продолжить")));

    public Registration_step_2_Page writeBirthday(String birthdayStr) {
        birthday.sendKeys(birthdayStr);
        return this;
    }

    public Registration_step_2_Page writeBirthPlace(String birthPlaceStr) {
        birthPlace.sendKeys(birthPlaceStr);
        return this;
    }

    public Registration_step_2_Page writeSurname(String surnameStr) {
        surname.sendKeys(surnameStr);
        return this;
    }

    public Registration_step_2_Page writeName(String nameStr) {
        name.sendKeys(nameStr);
        return this;
    }

    public Registration_step_2_Page writePatronymic(String patronymicStr) {
        patronymic.sendKeys(patronymicStr);
        return this;
    }

    public void clickEntryButton() {
        nextBTN.click();
    }
}
