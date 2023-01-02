package Solution;


public class Bmw extends BaseCar {

    public void go() {
        System.out.println("Car is now going");
    }

    public void stop() {
        System.out.println("Car was stopped");
    }

    @Override
    public double getCalculateKmCost() {
        return 1.75;
    }
}
