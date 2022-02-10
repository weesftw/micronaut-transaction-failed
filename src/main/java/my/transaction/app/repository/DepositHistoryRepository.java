package my.transaction.app.repository;

import jakarta.inject.Named;
import my.transaction.app.model.Deposit;
import org.springframework.jdbc.core.JdbcTemplate;

@Named
public class DepositHistoryRepository {

    private final JdbcTemplate jdbcTemplate;
    private final String insertQuery = "INSERT INTO DEPOSIT_HISTORY VALUES(?,?, CURRENT_TIMESTAMP())";

    public DepositHistoryRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void makeDepositHistory(Deposit deposit) {
        jdbcTemplate.update(
                insertQuery,
                deposit.getAccountNumber(),
                deposit.getAmount()
        );
    }

}
