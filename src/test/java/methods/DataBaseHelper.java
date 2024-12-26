package methods;

import properties.ConfigurationManager;

import java.sql.*;

public class DataBaseHelper {
    private static final String URL = "62.109.5.2/mk_online"; //jdbc:mysql://localhost:3306/your_database";
    private static final String USER = ConfigurationManager.configuration().user();
    private static final String PASSWORD = ConfigurationManager.configuration().password();

    public static ResultSet executeQueryWithParameter(String query, String parameter) {
        ResultSet resultSet = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, parameter);
            resultSet = preparedStatement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
