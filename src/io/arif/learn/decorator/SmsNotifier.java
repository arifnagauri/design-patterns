package io.arif.learn.decorator;

import java.util.List;

public class SmsNotifier extends NotifierDecoratorBase {

    protected SmsNotifier(INotifier notifier) {
        super(notifier);
    }

    // decorated element
    public void sendSms(List<Integer> userIds) {
        notifySystem();
        // send sms to interested users...
    }
}
