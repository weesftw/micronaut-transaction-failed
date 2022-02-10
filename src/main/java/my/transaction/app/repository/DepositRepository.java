package my.transaction.app.repository;

import jakarta.inject.Named;
import my.transaction.app.model.Deposit;
import org.springframework.jdbc.core.JdbcTemplate;

@Named
public class DepositRepository {

    private final JdbcTemplate jdbcTemplate;
    private final String updateQuery = "UPDATE ACCOUNTS SET BALANCE += ? WHERE ACCOUNT_NUMBER = ?";

    public DepositRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void makeDeposit(Deposit deposit) {
        jdbcTemplate.update(
                updateQuery,
                deposit.getAmount(),
                deposit.getAccountNumber()
        );
    }
}
