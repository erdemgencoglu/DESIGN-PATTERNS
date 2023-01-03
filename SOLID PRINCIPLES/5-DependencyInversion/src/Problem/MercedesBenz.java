package Problem;


import java.util.List;

public class MercedesBenz extends BaseCar implements IMailSendable,IMailSebdableDrivers {
    @Override
    public double calculatePerKm() {
        return 2;
    }


    @Override
    public void sendMailToDriver(DriverInfo info) {
        if (!info.getEmail().isEmpty()) {
            MailSender ms = new MailSender();
            ms.send();
        }
    }

    @Override
    public void sendMailToDrivers(List<DriverInfo> drivers) {
        drivers.forEach(driver -> {
            if (!driver.getEmail().isEmpty()) {
                sendMailToDriver(driver);
            }
        });
    }
}
