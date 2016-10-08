package io.github.yonghochoi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study?autoReconnect=true&useUnicode=true&characterEncoding=utf8", "user", "user");
    }
}
