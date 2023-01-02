package Solution;

import Problem.DriverInfo;
import Problem.MailSender;
import Problem.SmsSender;

//Sınıfı abstract class haline getirdik
public abstract class BaseCar {

    private double TripKm;
    public abstract double getCalculateKmCost();

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

    public double getTripKm() {
        return TripKm;
    }

    public void setTripKm(double tripKm) {
        TripKm = tripKm;
    }
}
