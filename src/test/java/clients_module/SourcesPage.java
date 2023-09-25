package clients_module;

import org.openqa.selenium.By;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static com.codeborne.selenide.Selenide.$;

public class SourcesPage {
    private Button createSourcesBTN = new Button($(By.xpath("//div[@lgmin:relative]/div/button")));
    private TextInput sourceName = new TextInput($(By.xpath("//div[@relative flex w-full flex-col]/form/fieldset/fieldset/div/div/input")));
    private TextInput sourceUTM = new TextInput($(By.xpath("//div[@relative flex w-full flex-col]/form/haha/fieldset/div/div/input")));
    private Button saveBTN = new Button($(By.xpath("//div[@mt-8 flex items-center justify-between]/article/div/button")));

    public SourcesPage createSourcesBTNclick() {
        createSourcesBTN.click();
        return this;
    }

    public SourcesPage writeSourceName(String str) {
        sourceName.sendKeys(str);
        return this;
    }

    public SourcesPage writeSourceUTM(String str) {
        sourceUTM.sendKeys(str);
        return this;
    }

    public SourcesPage saveBTNclick() {
        saveBTN.click();
        return this;
    }
}