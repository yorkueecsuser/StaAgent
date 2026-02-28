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
                // Unreachable while loop
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                    System.out.println("This line should never execute.");
                }

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

    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}