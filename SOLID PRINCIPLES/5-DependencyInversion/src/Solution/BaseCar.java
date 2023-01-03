package Solution;

public abstract class BaseCar {

    private double tripKm = 1;

    public abstract double calculatePerKm();

    public void go() throws DriveException, TierException {};
    public void stop(){};
    public double getTripKm() {
        return tripKm;
    }

    public void setTripKm(double tripKm) {
        this.tripKm = tripKm;
    }
}
