package Problem;

public class Main {
    public static void main(String[] args) {
        /*
            1- Bir loglalama mekanizmamız olsun.Araç için alınan hataları Almanyaya göndersi  ->TripInfoLogger
            2- İleriki bir zamanda araca içine çip yerleştirdik bunun üzerine loglansın özelliği istendi.
            3- Bu durumda TripInfoLogger clasında yenir bir class ve loglama metodu tanımlamış olmamız gerekecek ve Üst sınıf içinde bulunan bir alt sınıfa bağımlı (MemoryLogger ve oluşacak diğer sınflar) olacaktır.
            4- Bu tarz durumlarda abstraction kullanılır.(Interfaceler vb.)
        */
        try {
            MercedesBenz ms = new MercedesBenz();
            ms.go();
            ms.stop();
        } catch (DriveException exception) {
            TripInfoLogger tr = new TripInfoLogger();
            tr.LogToGermany(exception.getMessage());
        } catch (TierException exception) {
            TripInfoLogger tr = new TripInfoLogger();
            tr.LogToMemory(exception.getMessage());
        }
    }


}