package properties;
import org.aeonbits.owner.Config;

@Config.Sources("file:./src/test/resources/application.properties")
public interface ConfigurationProperties extends Config {
    @Config.Key("url")
    String url();

    @Config.Key("e_mail")
    String e_mail();

    @Config.Key("password_for_login")
    String password_for_login();

    @Config.Key("phoneNumber")
    String phoneNumber();

    @Config.Key("first_Name")
    String first_Name();

    @Config.Key("last_Name")
    String last_Name();

    @Config.Key("companyName")
    String companyName();

    @Config.Key("address")
    String address();

    @Config.Key("url_myAccount")
    String url_myAccount();

    @Config.Key("url_registration")
    String url_registration();

    @Config.Key("url_login")
    String url_login();
}
