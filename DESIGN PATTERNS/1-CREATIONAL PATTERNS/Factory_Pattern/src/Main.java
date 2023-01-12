public class Main {
    public static void main(String[] args) {
        PhoneFactory factory=new PhoneFactory();

        Phone iphone=factory.PhoneFactory(PhoneFactory.PhoneModel.IPHONE);

        iphone.name();
    }
}