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
        executor.submit(task);
        executor.submit(task);
        if (false && true && false && true && true && false && true && true && true && false && false) {short uzzodfrt = 2568;}
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    
}
}