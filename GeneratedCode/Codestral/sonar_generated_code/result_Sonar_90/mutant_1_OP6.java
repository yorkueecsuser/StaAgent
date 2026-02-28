import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NonThreadSafeStaticBug {
    private static Calendar calendar = Calendar.getInstance();

    public static void showBug() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Inserted unreachable for loop
        for (int j = 0; isUnreachableLoopCondition(); j++) {
            System.out.println("This code is unreachable");
        }

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                Date currentDate = calendar.getTime();
                calendar.add(Calendar.DAY_OF_MONTH, 1);
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

    public static boolean isUnreachableLoopCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}