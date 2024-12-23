package properties;
import org.aeonbits.owner.Config;

@Config.Sources("file:./src/test/resources/application.properties")
public interface ConfigurationProperties extends Config {
    @Config.Key("url")
    String url();

    @Config.Key("reg_type")
    String reg_type();

    @Config.Key("reg_step1")
    String reg_step1();

    @Config.Key("e_mail")
    String e_mail();
    @Config.Key("phoneNumber")
    String phoneNumber();

    @Config.Key("surname")
    String surname();
    @Config.Key("name")
    String name();
    @Config.Key("patronymic")
    String patronymic();

    @Config.Key("birthday")
    String birthday();
    @Config.Key("birthPlace")
    String birthPlace();

    @Config.Key("passportSeria")
    String passportSeria();
    @Config.Key("passportNumber")
    String passportNumber();
    @Config.Key("passportCode")
    String passportCode();
    @Config.Key("passportDate")
    String passportDate();

    @Config.Key("address")
    String address();

    @Config.Key("bank")
    String bank();

}
