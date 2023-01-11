public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {
        System.out.println("Instance created");
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

