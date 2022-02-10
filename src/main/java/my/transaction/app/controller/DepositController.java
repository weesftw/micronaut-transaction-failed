package my.transaction.app.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import my.transaction.app.model.Deposit;
import my.transaction.app.service.DepositService;

@Controller("/deposit")
public class DepositController {

    private final DepositService depositService;

    @Inject
    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @Post
    public void deposit(@Body Deposit deposit) {
        depositService.makeDeposit(deposit);
    }

}
