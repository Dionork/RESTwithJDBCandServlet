package org.course.aston;

import org.course.aston.dbconnection.ConnectionDB;
import org.course.aston.dbconnection.ConnectionDBImp;
import org.course.aston.util.InitSchemeSQL;

public class Main {
    public static void main(String[] args) {
        ConnectionDB connection = new ConnectionDBImp().getInstance();
        InitSchemeSQL.initSchemeSql((ConnectionDBImp) connection);
        InitSchemeSQL.initDataSql((ConnectionDBImp) connection);
    }
}
