package Solution;

public class TripInfoLogger {

    ILogger iLogger;

    public TripInfoLogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }

    public void Log(String log) {
        iLogger.log(log);
    }
}


