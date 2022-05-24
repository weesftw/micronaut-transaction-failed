package my.transaction.app.workflow.definition;

import my.transaction.app.workflow.definition.ActivityItem;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Throwable.class)
public class TransactionalActityItem<INPUT, OUTPUT> {

    private ActivityItem<INPUT, OUTPUT> delegate;

    public TransactionalActityItem(ActivityItem<INPUT, OUTPUT> item) {
        this.delegate = item;
    }

    public OUTPUT execute(INPUT args) {
        return delegate.doExecute(args);
    }

}
