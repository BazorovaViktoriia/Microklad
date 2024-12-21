package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Registration_step_3_fast {
    private SelenideElement firstPhoto = $(By.xpath("//*[@id=\"photos\"]/div[2]/div[1]/form/div/input"));
    private SelenideElement secondPhoto = $(By.xpath("//*[@id=\"photos\"]/div[2]/div[3]/form/div/input"));


    public Registration_step_3_fast uploadFirstPhoto() {
        firstPhoto.uploadFile(new File("C:/Users/Виктория Базарова/Desktop/для теста.jpg")); // Загрузка файла
    return this;
    }


    public Registration_step_3_fast uploadSecondPhoto() {
        secondPhoto.uploadFile(new File("C:/Users/Виктория Базарова/Desktop/для теста.jpg")); // Загрузка файла
        return this;

    }


}
