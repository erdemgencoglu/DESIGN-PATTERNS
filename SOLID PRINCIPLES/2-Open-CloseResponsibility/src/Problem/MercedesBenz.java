package Problem;

public class MercedesBenz extends BaseCar {
    private double TripKm;

    public void go() {
        System.out.println("Car is now going");
    }

    public void stop() {
        System.out.println("Car was stopped");
    }

    public double getTripKm() {
        return TripKm;
    }

    public void setTripKm(double tripKm) {
        TripKm = tripKm;
    }
}
