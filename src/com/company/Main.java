package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello world!");

        User[] users = {};
        // render the table in JFrame
        // pull data from DB

        try {
            // driver init
            Class.forName("com.mysql.cj.jdbc.Driver");

            // connection string
            String db_connection = "jdbc:mysql://localhost/jdbc_gui_users";
            // connection init
            Connection connection = DriverManager.getConnection(db_connection, "root", "");

            // statement
            Statement statement = connection.createStatement();

            // query
            ResultSet usersResultSet = statement.executeQuery("select * from `users`");

            // iterate through the result set and push each user to list
            while (usersResultSet.next()) {
                int[] cols = {1, 2, 3, 4};

                /* [DEBUG] */
                for(int col: cols) {
                    System.out.println(usersResultSet.getString(col));
                }
                User fetchedUser = new User(usersResultSet.getInt(1), usersResultSet.getString(2), usersResultSet.getString(3), usersResultSet.getDouble(4));

                users = addToUsers(users, fetchedUser);
            };

            System.out.println("Database connection successful!!");
        } catch (Exception e) {
            System.out.println("An Error occurred while connecting to DB!");
            System.out.println(e);
        }

        new AppFrame(users);
    }

    private static User[] addToUsers(User[] initialUsers, User user) {
        User[] newArr = new User[initialUsers.length + 1];

        for (int i = 0; i < initialUsers.length; i++) {
            newArr[i] = initialUsers[i];
        }

        newArr[initialUsers.length]  = user;

        return newArr;
    }
}