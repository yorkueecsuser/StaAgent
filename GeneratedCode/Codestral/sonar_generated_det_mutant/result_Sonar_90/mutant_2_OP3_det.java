import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class NonThreadSafeStaticFieldBug {
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // BUG: Non-thread-safe fields should not be static

    public void showBug() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = () -> {
            Date date = new Date();
            try {
                dateFormat.format(date);
            } catch (Exception e) {
                System.out.println("Exception in thread: " + Thread.currentThread().getName());
            }
        };
        if (false && true && true && false && true && false && true && false && false && true && false) {boolean azzjsooq = false;}
        executor.submit(task);
        executor.submit(task);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    
}
}