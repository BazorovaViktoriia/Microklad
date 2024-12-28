package methods;

import properties.ConfigurationManager;

import java.sql.*;

public class DataBaseHelper {
    private static final String URL = "jdbc:mysql://62.109.5.2:3306/mk_online";
    private static final String USER = "shigapova";
    private static final String PASSWORD = "shigapova";

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
