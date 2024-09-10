package org.course.aston.dbConnection;

import java.sql.Connection;
import java.sql.SQLException;
/** Интерфейс для подключения к базе данных
 * */
public interface ConnectionDB {
    Connection getConnection() throws SQLException;
}
