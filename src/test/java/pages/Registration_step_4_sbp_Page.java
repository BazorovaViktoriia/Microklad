package pages;

import methods.DataBaseHelper;
import methods.UsersCookie;

import java.sql.ResultSet;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Registration_step_4_sbp_Page {

    public Registration_step_4_sbp_Page getAgreement() {
        $((byText("Я ознакомлен и согласен:"))).click();
        return this;
    }

    public Registration_step_4_sbp_Page getSms() {
        String sessID = UsersCookie.getCookieSid();

        $((byText("Получить"))).click();

        return this;
    }

    public void getCredit() {
        $((byText("Получить займ"))).click();
    }

    public Registration_step_4_sbp_Page getUSerID() {
        String sessID = UsersCookie.getCookieSid();

        String query = "SELECT id FROM users where sess_id LIKE ?";
        try {

            ResultSet resultSet = DataBaseHelper.executeQueryWithParameter(query, "%" + sessID + "%");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");

                System.out.println("user_ID: " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }
}