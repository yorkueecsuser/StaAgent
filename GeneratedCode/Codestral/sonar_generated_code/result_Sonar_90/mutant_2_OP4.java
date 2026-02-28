import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NonThreadSafeStaticBug {
    private static Calendar calendar = Calendar.getInstance();

    public static void showBug() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                Date currentDate = calendar.getTime();
                calendar.add(Calendar.DAY_OF_MONTH, 1);

                // Inserted unreachable if-else statement
                if (getUnreachableCondition()) {
                    // Unreachable code
                    System.out.println("This code should not be reached.");
                } else {
                    // Continue with the original code
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(currentDate);
                }
            });
        }

        executorService.shutdown();
    }

    private static boolean getUnreachableCondition() {
        return false; // Always return false to make the condition unreachable
    }

    public static void main(String[] args) {
        showBug();
    }
}