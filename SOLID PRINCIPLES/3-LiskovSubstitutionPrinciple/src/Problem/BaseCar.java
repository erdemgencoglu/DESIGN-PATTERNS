package Problem;

public abstract class BaseCar {

    private double tripKm = 1;

    public abstract double calculatePerKm();


    public void sendMailToDriver(DriverInfo info) {
        if (!info.getEmail().isEmpty()) {
            MailSender ms = new MailSender();
            ms.send();
        }

    }

    public void sendSmsToDriver(DriverInfo info) {
        if (!info.getPhoneNumber().isEmpty()) {
            SmsSender sm = new SmsSender();
            sm.send();
        }
    }

    public double getTripKm() {
        return tripKm;
    }

    public void setTripKm(double tripKm) {
        this.tripKm = tripKm;
    }
}
