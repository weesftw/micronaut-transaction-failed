package my.transaction.app.model;

import io.micronaut.core.annotation.Introspected;

import java.math.BigDecimal;

@Introspected
public class Deposit {
    private String accountNumber;
    private BigDecimal amount;

    public Deposit(String accountNumber, BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public Deposit() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
