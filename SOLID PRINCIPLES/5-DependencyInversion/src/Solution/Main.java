package Solution;

public class Main {
    public static void main(String[] args) {
        /*
            1- Abstraction kullanarak class bağımlılığını kaldırmış olduk
            2- Yeni değişiklikler istendiğinde Loglama mekanizmamız uyum sağlayacaktır
            3- Dependency inversion karşılanmıl oldu
        */
        try {
            MercedesBenz ms = new MercedesBenz();
            ms.go();
            ms.stop();
        } catch (DriveException exception) {
            new TripInfoLogger(new GermanyLogger()).Log(exception.getMessage());
        } catch (TierException exception) {
            new TripInfoLogger(new MemoryLogger()).Log(exception.getMessage());
        }
    }


}