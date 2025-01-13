package tests;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import methods.AddBankAccount;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddBankAccountTest extends AddBankAccount {

    @Owner("Базорова Виктория")
    @Description("Проверка добавления счета СБП из ЛК Клиента")
    @Test
    public void addBankAccountTest() throws InterruptedException {
        addBankAccount();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://shigapova.microklad.ru/user/addtinkoffsbp",
                "нет перехода на страницу Добавления счета");
    }
}