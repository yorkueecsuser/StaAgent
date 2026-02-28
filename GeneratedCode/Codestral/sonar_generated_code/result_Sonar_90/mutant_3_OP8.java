import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NonThreadSafeStaticBug {
    private static Calendar c = Calendar.getInstance(); // Renamed calendar to c

    public static void showBug() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                Date currentDate = c.getTime(); // Updated to use the renamed variable
                c.add(Calendar.DAY_OF_MONTH, 1); // Updated to use the renamed variable
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(currentDate);
            });
        }

        executorService.shutdown();
    }

    public static void main(String[] args) {
        showBug();
    }
}