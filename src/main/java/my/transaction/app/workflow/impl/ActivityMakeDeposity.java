package my.transaction.app.workflow.impl;


import jakarta.inject.Inject;
import jakarta.inject.Named;
import my.transaction.app.model.Deposit;
import my.transaction.app.service.DepositService;
import my.transaction.app.workflow.definition.ActivityItem;

@Named
public class ActivityMakeDeposity extends ActivityItem<Deposit, Void> {

    @Inject
    DepositService depositService;

    @Override
    public Void doExecute(Deposit deposit) {
        return depositService.makeDeposit(deposit);
    }
}
