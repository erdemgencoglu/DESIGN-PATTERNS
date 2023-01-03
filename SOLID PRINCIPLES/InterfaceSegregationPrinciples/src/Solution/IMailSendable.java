package Problem;

import Problem.DriverInfo;

import java.util.List;

public interface IMailSendable {
    public void sendMailToDriver(DriverInfo driverInfo);

    public void sendMailToDrivers(List<DriverInfo> drivers);
}
