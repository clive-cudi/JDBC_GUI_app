package com.company;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UserModel extends AbstractTableModel {
    private final List<User> userList;

    private final String[] columnNames = new String[] {
            "id", "name", "email", "score"
    };

    private final Class[] columnClass = new Class[] {
            Integer.class, String.class, String.class, Float.class
    };

    public UserModel(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return userList.size();
    }

    @Override
    public Object getValueAt(int rix, int cix) {
        User row = userList.get(rix);

        switch (cix) {
            case 0:
                return row.getId();
            case 1:
                return row.getName();
            case 2:
                return row.getEmail();
            case 3:
                return row.getScore();
            default:
                return null;
        }
    }
}
