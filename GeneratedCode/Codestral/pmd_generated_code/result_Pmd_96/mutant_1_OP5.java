import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class UnsynchronizedStaticFormatterBug {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static String[] showBug() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        String[] results = new String[10];

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.execute(() -> {
                Date date = new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(index)); // different dates for each thread
                int unreachableValue = getUnreachableValue(); // Mutant: Unreachable switch statement
                switch (unreachableValue) {
                    case 1:
                        System.out.println("This code should not be reached.");
                        break;
                }
                results[index] = sdf.format(date); // BUG: UnsynchronizedStaticFormatter
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        return results;
    }

    private static int getUnreachableValue() {
        return 2; // This value is always greater than 1, making the case statement unreachable
    }

    public static void main(String[] args) throws InterruptedException {
        String[] results = showBug();
        for (String result : results) {
            System.out.println(result);
        }
    }
}