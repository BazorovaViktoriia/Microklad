package pages;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

public class SecondRegistrationFormPage {

    private TextInput companyName = new TextInput($(By.xpath("//*[@id=\"app\"]/section/div[1]/div[2]/div/div/div[2]/form/div/fieldset/fieldset/div/div/input"))); //
    private TextInput job_title = new TextInput($(By.xpath("//*[@id=\"app\"]/section/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/div"))); // верно - переделай

    private TextInput phone = new TextInput($(By.name("//*[@id=\"app\"]/section/div[1]/div[2]/div/div/div[2]/form/div/div[2]/div/button[8]"))); // выбрать специфику деятельности

    private Button avatarBtn = new Button($(By.className("entry-submit block w-full")));
}
