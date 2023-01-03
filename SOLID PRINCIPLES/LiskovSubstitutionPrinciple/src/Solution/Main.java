package Problem;

public class Main {
    public static void main(String[] args) {
        /*
            1- Liskov prensibine göre inherit eden classlar inherit ettikleri classların tüm metotlarını kullanmalı ve onun yerine kullanılabilmelidir.
            2- Şuanki durumda MercedesBenz ve Bmw classları BaseCar sınıfının tüm özelliklerini kullanabilmektedir.
            3- Fakat ilerki zamanlarda Mercedes firması ben kullanıcılara sms gönderme özelliğini kaldırdım bir daha kullanmıycam dediğinde
            4- Bu prensip ihlal edilmiş olucaktır. Bu gibi durumlarda
            5- Interface ler kullanılır ve yapılan işlem metotları interface olarak yazılmalıdır.
        */
        FuelCostCalculator fuelCostCalculator=new FuelCostCalculator();
        System.out.println(fuelCostCalculator.calculate(new MercedesBenz()));
        System.out.println(fuelCostCalculator.calculate(new Bmw()));
    }
}