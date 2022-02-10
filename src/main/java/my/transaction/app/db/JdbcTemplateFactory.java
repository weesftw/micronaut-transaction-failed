package my.transaction.app.db;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Factory
public class JdbcTemplateFactory {

    private final DataSource dataSource;

    @Inject
    public JdbcTemplateFactory(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    @Singleton
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }

}