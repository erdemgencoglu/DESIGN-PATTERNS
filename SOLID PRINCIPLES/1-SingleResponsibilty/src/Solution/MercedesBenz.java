package Solution;

import Problem.DriverInfo;
import Problem.MailSender;
import Problem.SmsSender;

public class MercedesBenz extends BaseCar{
    private double TripKm;

    public void go() {
        System.out.println("Car is now going");
    }

    public void stop() {
        System.out.println("Car was stopped");
    }

    //1- Single Responsbility prensibine göre işleri bir birinden ayırarak prensib ihlalini kaldırmış olduk
    //2- Bmw diye yeni bir markamız olsun ve bu araçta aşağıdaki metotları kullanacağından Base bir sınıf oluşturalım ve bu araçları bu sınıftan inherit edelim
    //3- Bu metotları da BaseCar sınıfımıza taşıyalım
    /*
    public void sendInfoMailToDriver(DriverInfo info) {
        if (!info.getEmail().isEmpty()) {
            MailSender ms = new MailSender();
            ms.send();
        }
    }

    public void sendInfoSmsToDriver(DriverInfo info) {
        if (!info.getPhoneNumber().isEmpty()) {
            SmsSender sm = new SmsSender();
            sm.send();
        }
    }
    */
}
