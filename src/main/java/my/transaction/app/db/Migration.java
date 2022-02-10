package my.transaction.app.db;

import io.micronaut.context.annotation.Context;
import jakarta.inject.Inject;
import org.flywaydb.core.Flyway;

import javax.sql.DataSource;

@Context
public class Migration {

    @Inject
    public Migration(DataSource dataSource)
    {
        var flyway = Flyway.configure()
                .dataSource(dataSource)
                .locations("classpath:SQL/schema")
                .load();
        flyway.migrate();
    }
}
