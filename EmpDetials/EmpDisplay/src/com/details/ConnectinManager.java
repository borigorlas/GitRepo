package com.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectinManager {
            private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
            private final String DRIVER_CLASS_NAME="oracle.jdbc.driver.OracleDriver";
            private final String USER_NAME="HR";
            private final String PASSWORD="HR";
            private static Connection con;
            private static ConnectinManager instance;

    public static ConnectinManager getInstance() {
        if(instance ==null){
            synchronized (ConnectinManager.class){
                instance=(instance==null)?new ConnectinManager():instance;
            }
        }
        return instance;
    }
    
    public Connection getConn(){
        
        try {
            Class.forName(DRIVER_CLASS_NAME);
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException |ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }


}
