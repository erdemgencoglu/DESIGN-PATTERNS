package Solution;


public class FuelCostCalculator {

    public double calculate(BaseCar car) {
        return car.getTripKm() * car.calculatePerKm();
    }

}
