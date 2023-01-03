package Problem;

public class TripInfoLogger {

    public void LogToGermany(String log) {
        new GermanyLogger().log(log);
    }
    //!!! bağımlı
    public void LogToMemory(String log) {
        new MemoryLogger().log(log);
    }


    public class GermanyLogger {
        public void log(String log) {
            System.out.println("log sended");
        }
    }
    //!!! bağımlı
    public class MemoryLogger {
        public void log(String log) {
            System.out.println("log sended");
        }
    }


}


