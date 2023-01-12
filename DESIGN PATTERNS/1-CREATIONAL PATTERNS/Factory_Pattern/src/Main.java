public class Main {
    public static void main(String[] args) {

        /*
            Üst sınıf ve alt sınıfların olduğu bir mimaride hangi nesneden sınıf oluşturulacağına
            alt sınıfların belirleğebildiği tasarım kalıbıdır.
            Amaç sınıf yaratma işini(sürekli new leme) istemci classta yapılmasını engellemektir
        */

        // 1- Aynı türde sınıfların oluşturulmasında kullanılır
        // 2- Aynı tür sınıflar abstract method içeren veya arayüz oluşturularak bu sınıftan türetilirler
        // 3- Ortak bir üretim sınıfı kullanılarak tek yerden oluşturulmaları sağlanır.
       /*
           Tek yerden yönetim, Kod bakımı kolay, Loosely coupled(gevşek bağlılık) sağlar

       */
        PhoneFactory factory=new PhoneFactory();
        Phone iphone=factory.PhoneFactory(PhoneFactory.PhoneModel.IPHONE);
        Phone samsung=factory.PhoneFactory(PhoneFactory.PhoneModel.SAMSUNG);
        Phone xiaomi=factory.PhoneFactory(PhoneFactory.PhoneModel.XIAOMI);
        iphone.name();
        samsung.name();
        xiaomi.name();
    }
}