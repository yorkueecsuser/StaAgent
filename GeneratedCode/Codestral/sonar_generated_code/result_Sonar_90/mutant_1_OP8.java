import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NonThreadSafeStaticBug {
    private static Calendar cal = Calendar.getInstance();

    public static void showBug() {
        ExecutorService execService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            execService.submit(() -> {
                Date curDate = cal.getTime();
                cal.add(Calendar.DAY_OF_MONTH, 1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(curDate);
            });
        }

        execService.shutdown();
    }

    public static void main(String[] args) {
        showBug();
    }
}