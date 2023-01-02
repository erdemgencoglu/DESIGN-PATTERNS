package Problem;

public class FuelCostCalculator {
    /*
        1- Farklı bir araç için calculate metodu değiştirilmek zorundadır
        2- Open-Closed prensiblerine aykırıdır.
        3- Bu tarz durumlarda abstract sınıflardan yararlanılır.
     */
    public double getCalculateKmCost(MercedesBenz car) {
        return car.getTripKm() * 2;
    }
}
