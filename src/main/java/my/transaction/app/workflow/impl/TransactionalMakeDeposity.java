package my.transaction.app.workflow.impl;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;
import my.transaction.app.model.Deposit;
import my.transaction.app.workflow.definition.TransactionalActityItem;

@Factory
public class TransactionalMakeDeposity {

    private final ActivityMakeDeposity activityMakeDeposity;

    public TransactionalMakeDeposity(ActivityMakeDeposity activityMakeDeposity) {
        this.activityMakeDeposity = activityMakeDeposity;
    }

    @Bean
    @Singleton
    public TransactionalActityItem<Deposit, Void> provideTxActivity() {
        return new TransactionalActityItem<>(activityMakeDeposity);
    }

}
