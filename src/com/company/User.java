package com.company;

public class User {
    private int id;
    private String name;
    private String email;
    private double score;
    public User(int id, String name, String email, double score) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
