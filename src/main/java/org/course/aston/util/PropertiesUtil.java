package org.course.aston.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Класс для работы с свойствами db.properties
 */
public class PropertiesUtil {
    private static Properties propeties = new Properties();
    private static String propertiesFile = "db.properties";

    static { // Загрузка свойств
        loadProperties();
    }

    /**
     * Возвращает значение свойства по ключу
     *
     * @param key ключ свойства
     */
    public static String getProperty(String key) {
        return propeties.getProperty(key);
    }
    /** Метод для загрузки свойств
     * */
    public static void loadProperties() {
        try (InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesFile)) {
            propeties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
