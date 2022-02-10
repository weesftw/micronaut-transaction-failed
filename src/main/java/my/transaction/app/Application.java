package my.transaction.app;

import io.micronaut.runtime.Micronaut;
import org.h2.tools.Server;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        Server.createWebServer().start();
        Micronaut.run(Application.class, args);
    }
}
