package io.arif.learn.decorator;

abstract public class NotifierDecoratorBase implements INotifier {

    private final INotifier notifier;

    protected NotifierDecoratorBase(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notifySystem() {
        notifier.notifySystem();
    }

}
