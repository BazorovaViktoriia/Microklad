package tests;

import com.microsoft.playwright.*;
import properties.ConfigurationManager;

import static java.lang.Thread.sleep;

public class PlayWrite {
    public static Browser browser;
    public static Playwright playwright;
    public static Page page;
    public static BrowserContext context;

    public static void main(String[] args) throws Exception {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("https://dev.devselink.ru/");
            System.out.println(page.title());
        }


        /*
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions());

        context = browser.newContext();
        page = context.newPage();
        page.navigate(ConfigurationManager.configuration().url());
        page.setViewportSize(1920, 1080);
        sleep(3000);
        browser.close();
    }*/
    }
}
