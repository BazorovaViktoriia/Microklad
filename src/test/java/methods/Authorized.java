package methods;

import base.TestBase;
import pages.LoginPage;
import pages.MainPage;
import properties.ConfigurationManager;

public class Authorized extends TestBase {
    private String tel = ConfigurationManager.configuration().telephone();
    private String password = ConfigurationManager.configuration().passwordLK();


    public void login() throws InterruptedException{
        new MainPage().login();

        new LoginPage()
                .writeTel(tel)
                .writePassword(password)
                .clickBTN();
    }
}