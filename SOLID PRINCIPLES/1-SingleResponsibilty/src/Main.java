import Problem.DriverInfo;
import Problem.MercedesBenz;

public class Main {
    public static void main(String[] args) {
        new MercedesBenz().sendInfoToDriver(new DriverInfo("a@a.com", "0123"));
    }
}