package Problem;

public class MercedesBenz {
    private double TripKm;

    public void go() {
        System.out.println("Car is now going");
    }

    public void stop() {
        System.out.println("Car was stopped");
    }

    /*

    Sürücüye araç ile ilgili mail ve sms atan bir metot olsun
    1- Single responsibility prensibine göre bir şeyi yapabiliyor olmak o işi yapmak zorunda olduğumuzu göstermez
    2- Aşağıdaki metot bu prensibe uymaz
    3- Bir metot birden fazla işi yapmamalıdır.
    4- Ayrıca sınıf bazında da single responsibility sorgulanabilir. Burada sağlanmamakta Problem.MercedesBenz sınıfında neden bilgi gönderme metodu var?

    */
    public void sendInfoToDriver(DriverInfo info) {
        if (!info.getEmail().isEmpty()) {
            MailSender ms = new MailSender();
            ms.send();
        }
        if (!info.getPhoneNumber().isEmpty()) {
            SmsSender sm = new SmsSender();
            sm.send();
        }
    }
}
