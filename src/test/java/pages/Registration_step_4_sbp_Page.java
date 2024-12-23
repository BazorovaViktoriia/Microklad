package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Registration_step_4_sbp_Page {

    public Registration_step_4_sbp_Page getAgreement() {
        $((byText("Я ознакомлен и согласен:"))).click();
        return this;
    }

    public Registration_step_4_sbp_Page getSms() {
        $((byText("Получить"))).click();
        return this;
    }

    public void getCredit() {
        $((byText("Получить займ"))).click();
    }
}