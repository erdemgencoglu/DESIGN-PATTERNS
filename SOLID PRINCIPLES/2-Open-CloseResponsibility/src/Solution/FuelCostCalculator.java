package Solution;


public class FuelCostCalculator {
    /*
        Abstract class kullanarak değişime kapamış gelişime de açık hale getirmiş olduk
        Open-Close prensibini sağlamış olduk
    */
    public double getCalculateKmCost(BaseCar car) {
        return car.getTripKm() * car.getCalculateKmCost();
    }

}
