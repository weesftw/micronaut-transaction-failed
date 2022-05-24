package my.transaction.app.workflow.definition;

public abstract class ActivityItem<INPUT, OUTPUT> {

    protected abstract OUTPUT doExecute(INPUT args);

    public OUTPUT execute(INPUT args) {
        return doExecute(args);
    }
}
