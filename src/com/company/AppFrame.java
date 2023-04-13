package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AppFrame extends JFrame {
    public AppFrame(User[] users) {
        this.setTitle("Users in Database");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(600, 500);
        this.setResizable(false);

        List<User> userList = new ArrayList<User>(List.of(users));

        UserModel model = new UserModel(userList);

        JTable table = new JTable(model);

        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }
}
