import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NonThreadSafeStaticBug {
    private static Calendar calendar = Calendar.getInstance();

    private static boolean getUnreachableCondition() {
        // Implement a condition that is always false
        return false;
    }

    public static void showBug() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                Date currentDate = calendar.getTime();
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Mutated code: Unreachable if statement
                if (getUnreachableCondition()) {
                    System.out.println("This line will never be executed.");
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