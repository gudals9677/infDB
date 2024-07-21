package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;
/*
*   JDBC를 이용해서 실제 H2 데이터베이스에 연결할 Connection을 가져온다
*   JAVA에서 데이터베이스에 연결 하려면 DriverManager.getConnection() 메소드를 사용
* */
@Slf4j
public class DBConnectionUtil {
    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get connection={}", connection, connection.getClass());
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException();
        }
    }
}
