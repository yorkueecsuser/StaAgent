import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NonThreadSafeStaticBug {
    private static Calendar calendar = Calendar.getInstance();

    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                Date currentDate = calendar.getTime();
                calendar.add(Calendar.DAY_OF_MONTH, 1);

                // Add unreachable switch statement
                int unreachableValue = 0;
                switch (unreachableValue) {
                    case 1:
                        System.out.println("This code is unreachable");
                        break;
                }

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