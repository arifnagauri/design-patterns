package io.arif.learn.decorator;

import java.util.List;

public class EmailNotifier extends NotifierDecoratorBase {

    protected EmailNotifier(INotifier notifier) {
        super(notifier);
    }

    // decorated element
    public void sendEmail(List<Integer> userIds) {
        notifySystem();
        // send email to interested users...
    }
}
