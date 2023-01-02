package Solution;

public class Main {
    public static void main(String[] args) {

        FuelCostCalculator calc = new FuelCostCalculator();
        double mcost = calc.getCalculateKmCost(new MercedesBenz());
        double bcost = calc.getCalculateKmCost(new Bmw());

        //Calculate metodunu hangi araç gelirse gelsin değiştirmeden uyum sağlamasını oluşturmuş olduk
    }
}