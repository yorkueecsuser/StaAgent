import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

class BuggyFuture {
public void showBug() throws ExecutionException , InterruptedException {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor = Executors.newScheduledThreadPool(1);
    Future < String > future = executor.schedule(()-> "Result" , 1 , TimeUnit.SECONDS);
    try { future.get(); } finally { executor.shutdown(); }
}

    static class IllegalExceptionType extends Exception {
        public IllegalExceptionType(String message) {
            super(message);
        }

        public IllegalExceptionType(Throwable cause) {
            super(cause);
        }
    }

    public static void main(String[] args) throws Exception {
        new BuggyFuture().showBug();
    }
}