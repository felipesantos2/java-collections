package com.felipesantos2.db;

import java.sql.SQLException;

public class Connect {

    private String host;
    private String dbname;
    private String user;
    private String password;
    private String conn;

    public Connect() {

    }

    public void getConnection() {

        try {

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {

    }
}
