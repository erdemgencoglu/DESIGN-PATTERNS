package Solution;

import Problem.DriverInfo;
import Problem.MailSender;
import Problem.SmsSender;

public class BaseCar {
    public void sendInfoMailToDriver(DriverInfo info) {
        if (!info.getEmail().isEmpty()) {
            MailSender ms = new MailSender();
            ms.send();
        }
    }

    public void sendInfoSmsToDriver(DriverInfo info) {
        if (!info.getPhoneNumber().isEmpty()) {
            SmsSender sm = new SmsSender();
            sm.send();
        }
    }
}
