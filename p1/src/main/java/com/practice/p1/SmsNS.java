package com.practice.p1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNS")
public class SmsNS implements NotificationService {

    public String send() {
        return "Notification Sent on SMS";
    }
}
