package Solution;

import Problem.DriverInfo;
import Problem.SmsSender;

public class MercedesBenz extends BaseCar implements ISmsSendable{
    @Override
    public double calculatePerKm() {
        return 2;
    }

    @Override
    public void sendSmsToDriver(DriverInfo info) {
        if (!info.getPhoneNumber().isEmpty()) {
            SmsSender sm = new SmsSender();
            sm.send();
        }
    }
}
