package org.course.aston.dbConnection;

import org.course.aston.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/** Класс для подключения к базе данных имплементирует интерфейс ConnectionDB
 * */
public class ConnectionDBImp implements ConnectionDB {
    private String driver = "db.driver-class-name";
    private String url = "db.url";
    private String username = "db.username";
    private String password = "db.password";
    private ConnectionDB instance;
    /**Конструктор класса ConnectionDBImp
     * */
    public ConnectionDBImp() {
        instance = null; //new ConnectionDBImp();
        loadDriver(PropertiesUtil.getProperty(driver));
    }
/** Метод для получения экземпляра класса ConnectionDBImp
 * */
    public ConnectionDB getInstance() {
        if (instance == null) {
            instance = new ConnectionDBImp();
            loadDriver(PropertiesUtil.getProperty(driver));
        }
        return instance;
    }
    /**Метод для загрузки драйвера класса ConnectionDBImp
     * */
    private void loadDriver(String driver) {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**Метод для подключения к базе данных
     * */
    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                PropertiesUtil.getProperty(url),
                PropertiesUtil.getProperty(username),
                PropertiesUtil.getProperty(password));
    }
}

