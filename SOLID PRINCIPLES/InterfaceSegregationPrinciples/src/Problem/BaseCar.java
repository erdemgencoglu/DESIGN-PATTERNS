package Solution;

import Problem.DriverInfo;
import Problem.MailSender;
import Problem.SmsSender;

public abstract class BaseCar {

    private double tripKm = 1;

    public abstract double calculatePerKm();


    public double getTripKm() {
        return tripKm;
    }

    public void setTripKm(double tripKm) {
        this.tripKm = tripKm;
    }
}
