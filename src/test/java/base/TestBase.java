    package base;

    import com.codeborne.selenide.Configuration;
    import com.codeborne.selenide.Selenide;
    import com.codeborne.selenide.WebDriverRunner;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeEach;

    import org.openqa.selenium.WebDriver;

    import static com.codeborne.selenide.Selenide.open;

        public class TestBase {

            protected WebDriver driver;

            @BeforeEach
            public void createDriver() {
                WebDriverManager.chromedriver().setup();
                Configuration.browser = "Chrome";
                Configuration.driverManagerEnabled = true;
                open("https://dev.devselink.ru/");
                WebDriverRunner.getWebDriver().manage().window().maximize();
            }

            @AfterEach
            public void tearDown() {
                Selenide.closeWebDriver();
            }
        }