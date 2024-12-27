package methods;

import properties.ConfigurationManager;

import java.sql.*;

public class DataBaseHelper {
    private static final String URL = ConfigurationManager.configuration().dbUrl();
    private static final String USER = ConfigurationManager.configuration().dbUser();
    private static final String PASSWORD = ConfigurationManager.configuration().dbPassword();

    public static ResultSet executeQueryWithParameter(String query, String parameter) {
       System.out.println("Подключаюсь к бд");
        ResultSet resultSet = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Вошла в бд");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, parameter);
            resultSet = preparedStatement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
