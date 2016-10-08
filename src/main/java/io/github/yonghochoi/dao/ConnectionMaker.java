package io.github.yonghochoi.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws SQLException, ClassNotFoundException;
}
