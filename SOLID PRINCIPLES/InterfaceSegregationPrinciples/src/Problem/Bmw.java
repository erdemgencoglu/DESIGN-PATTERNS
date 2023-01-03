package Solution;

import Problem.DriverInfo;
import Problem.MailSender;
import Problem.SmsSender;

public class Bmw extends BaseCar implements IMailSendable, ISmsSendable {
    @Override
    public double calculatePerKm() {
        return 1.5;
    }

    @Override
    public void sendMailToDriver(DriverInfo info) {
        if (!info.getEmail().isEmpty()) {
            MailSender ms = new MailSender();
            ms.send();
        }
    }

    @Override
    public void sendSmsToDriver(DriverInfo info) {
        if (!info.getPhoneNumber().isEmpty()) {
            SmsSender sm = new SmsSender();
            sm.send();
        }
    }
}
