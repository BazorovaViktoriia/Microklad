package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class Addtinkoffsbp {
    private WebElement findBank = $(byClassName("select2-selection__placeholder"));

    public Addtinkoffsbp clickBank(){
        findBank.click();
        return this;
    }

    @Step("Добавляем счет СБП")
    public Addtinkoffsbp writeBankAccount(String str) throws InterruptedException{
        findBank.sendKeys(str);

        $((byText("банк Элита")))
                .should(exist).click();
        sleep(5000);
        $((byText("Добавить"))).click(); // красная кнопка Добавить
        sleep(5000);

        $((byText("банк Элита"))) //сама проверка
                .should(exist).click();

        return this;
    }
}
