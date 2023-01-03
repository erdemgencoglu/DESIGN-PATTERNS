package Solution;

import Problem.Bmw;
import Problem.DriverInfo;
import Problem.FuelCostCalculator;
import Problem.MercedesBenz;

public class Main {
    public static void main(String[] args) {
        /*
            1- Yapılan işler için interfaceler oluşturduk böylece bu işleri ilgili yerde kullanarak tüm classların inherit ettikleri classların özelliklerini kullanmasını sağladık
            2- Liskov prensibi sağlanmış oldu
        */
        FuelCostCalculator fuelCostCalculator=new FuelCostCalculator();
        System.out.println(fuelCostCalculator.calculate(new MercedesBenz()));
        System.out.println(fuelCostCalculator.calculate(new Bmw()));
    }
}