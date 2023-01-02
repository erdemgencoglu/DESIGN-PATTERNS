package Problem;

import Problem.FuelCostCalculator;
import Problem.MercedesBenz;

public class Main {
    public static void main(String[] args) {
        /*
            FuelCostCalculator içindeki calculator metodu gelişime kapalı ve değişime açık yani
            yeni bir araç için yakıt tüketimini hesaplamak istediğimizde calculate metodunu değiştirmek zorundayız

         */
        FuelCostCalculator calc = new FuelCostCalculator();
        double cost = calc.getCalculateKmCost(new MercedesBenz());

        System.out.println("Total cost for this car "+cost);
    }
}