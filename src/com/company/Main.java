package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // sample user static data [to be removed]
        User[] users = {new User(1, "Clive", "clivemaina41@gmail.com", 22.00), new User(1,"Mary", "mary@hotmail.com", 98)};

        // render the table in JFrame
        // pull data from DB

        new AppFrame(users);
    }
}