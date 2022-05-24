package my.transaction.app.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import my.transaction.app.model.Deposit;
import my.transaction.app.workflow.definition.TransactionalActityItem;

@Controller("/deposit")
public class DepositController {

    private final TransactionalActityItem activityMakeDeposity;

    @Inject
    public DepositController(TransactionalActityItem activityMakeDeposity) {
        this.activityMakeDeposity = activityMakeDeposity;
    }

    @Post
    public void deposit(@Body Deposit deposit) {
        activityMakeDeposity.execute(deposit);
    }

}
