package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Registration_step_4_Page {

    private TextInput address = new TextInput($(By.name("paddress")));

    private TextInput region = new TextInput($(By.name("pregion")));
    private TextInput city = new TextInput($(By.name("pcity")));
    private TextInput street = new TextInput($(By.name("pstreet")));
    private TextInput building = new TextInput($(By.name("pbuilding")));
    private TextInput apartment = new TextInput($(By.name("papartment")));

    private Button nextBTN = new Button($(byText("Продолжить")));

    public Registration_step_4_Page writeAddress(String address) {
        $(byId("address")).setValue(address).pressEnter(); // "addressField" замените на ваш локатор
        return this;
    }

    public Registration_step_4_Page writeRegion(String str) {
        region.sendKeys(str);
        return this;
    }

    public Registration_step_4_Page writeCity(String str) {
        city.sendKeys(str);
        return this;
    }

    public Registration_step_4_Page writeStreet(String str) {
        street.sendKeys(str);
        return this;
    }

    public Registration_step_4_Page writeBuilding(String str) {
        building.sendKeys(str);
        return this;
    }

    public Registration_step_4_Page writeApartment(String str) {
        apartment.sendKeys(str);
        return this;
    }


    public Registration_step_4_Page clickButton() {
        nextBTN.click();
        return this;
    }
}
