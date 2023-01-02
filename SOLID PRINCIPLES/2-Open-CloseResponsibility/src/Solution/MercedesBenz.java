package Solution;



public class MercedesBenz extends BaseCar {


    public void go() {
        System.out.println("Car is now going");
    }

    public void stop() {
        System.out.println("Car was stopped");
    }


    @Override
    public double getCalculateKmCost() {
        return 2;
    }
}
