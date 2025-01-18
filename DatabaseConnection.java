package com.classlearning.database;
import java.sql.*;
public class DatabaseConnection {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/sem3";
    private static final String userName = "root";
    private static final String password = "2406rAshniMagar";
    Connection connection = null;

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        try {
            // JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (Exception e) {
            System.out.println("System errors " + e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM studentsdata");
            while (resultSet.next()) {
                int Roll_Number = resultSet.getInt("Roll_Number");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("Roll_Number: " + Roll_Number);
                System.out.println("name: " + name);
                System.out.println("age: " + age);
                System.out.println("marks: " + marks);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("System error " + e.getMessage());
        }
    }
}
