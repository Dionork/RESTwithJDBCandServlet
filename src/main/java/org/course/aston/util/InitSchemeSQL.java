package org.course.aston.util;
import org.course.aston.dbconnection.ConnectionDBImp;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InitSchemeSQL {
    private static final String INIT_SCHEME_SQL = "sql/schema.sql";
    private static final String INIT_DATA_SQL = "sql/data.sql";
    private static String initSchemeSql;
    private static String initDataSql;

    static {
        loadSchemeDataSql();
    }

    private InitSchemeSQL() {
    }

    public static void loadSchemeDataSql() {
        try (InputStream is = InitSchemeSQL.class.getClassLoader().getResourceAsStream(INIT_SCHEME_SQL);
             InputStream is2 = InitSchemeSQL.class.getClassLoader().getResourceAsStream(INIT_DATA_SQL)) {
            initSchemeSql = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            initDataSql = new String(is2.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void initSchemeSql(ConnectionDBImp connectionDBImp) {
        try (Connection conn = connectionDBImp.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(initSchemeSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void initDataSql(ConnectionDBImp connectionDBImp) {
        try (Connection conn = connectionDBImp.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(initDataSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

