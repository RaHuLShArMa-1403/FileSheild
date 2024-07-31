package db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection = null ;
    public static Connection getConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Rahul1403");
            System.out.println("done");
            return connection;
        } catch (SQLException e) {
            System.err.println("Error while connecting to the database: " + e.getMessage());
            return null;
        }
    }
    public static void closeConnection(){
        if(connection != null){
            try{
                connection.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

}
