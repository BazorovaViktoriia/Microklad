package tests;

import base.TestBase;
import properties.ConfigurationManager;

public class NegativeAutho extends TestBase {
    private String mail = "Привет";
    private String pass = ConfigurationManager.configuration().password_for_login();
    Authorization authorizPage = new Authorization();


}
