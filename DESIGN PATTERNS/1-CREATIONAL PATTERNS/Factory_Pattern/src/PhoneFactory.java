public class PhoneFactory {


    enum PhoneModel {
        SAMSUNG,
        IPHONE,
        XIAOMI
    }

    public Phone PhoneFactory(PhoneModel model) {
        Phone phone = null;
        switch (model) {
            case IPHONE:
                phone = new Iphone();
                break;
            case SAMSUNG:
                phone = new Samsung();
                break;
            case XIAOMI:
                phone = new Xiaomi();
                break;
        }
        return phone;
    }
}
