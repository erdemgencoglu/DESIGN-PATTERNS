public class Main {
    public static void main(String[] args) {
        /*
        *  Bu dizayn kalıbında amaç bir nesneden sadece bir instance oluşturmayı amaçlar.
        *  Bir class için yeni bir nesne oluşturulmak istendiğinde class nesnesi daha önce oluşturulmuş ise oluşturulan instance çağrılır.
        *  Nesne oluşturulmamış ise instance oluşturulur.
        *
        * */
        // Singleton design pattern özellikleri
        //  1- Class tipinde private ve static bir variable oluşturulur oluşturulur.
        //  2- Constructer private olmalıdır (Nesne new lenmesi önlenir)
        //  3- Static nesneye erişmek için static getInstance() methodu oluşturulur.
        SingletonClass instance1= SingletonClass.getInstance();
        SingletonClass instance2= SingletonClass.getInstance();
    }
}