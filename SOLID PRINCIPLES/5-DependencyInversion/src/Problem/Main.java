package Solution;
public class Main {
    public static void main(String[] args) {
        /*
            1- Bir interface inherit edildiği yerde kullanılmayan soyut metotlar içermemelidir.
            2- Örnek olarak mail atma interface ine ilgili kullanıcılara mail atan bir özellik ekleyelim
            3- Bmw ve Mercedes classları kullanıcı bazlı mail gönderme işlemini her 2 sınıfta şuan gerçekleştiriyor
            4- Fakat ileride mercedes bu özelliği kaldırır ise Bmw kullanmış,Mercedes kullanmamış olacaktır.
            5- Interface segragation ihlali olmuş olur bu durumda bu ihlale sebeb olan iş ayrı interface olarak yazılır ve prensibe uygun hale getirilmiş olur
        */
        FuelCostCalculator fuelCostCalculator=new FuelCostCalculator();
        System.out.println(fuelCostCalculator.calculate(new MercedesBenz()));
        System.out.println(fuelCostCalculator.calculate(new Bmw()));
    }
}