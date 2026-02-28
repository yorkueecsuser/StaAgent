import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class UnsynchronizedStaticFormatterBug {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static boolean getCondition() {
        return false; // Always returns false to make the branch unreachable
    }

    public static String[] showBug() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        String[] results = new String[10];

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.execute(() -> {
                Date date = new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(index));
                results[index] = sdf.format(date);

                // Mutant: Unreachable if-else statement
                if (getCondition()) {
                    // This block is unreachable
                    System.out.println("Unreachable code");
                } else {
                    // This block is also unreachable but included for completeness
                    System.out.println("Another unreachable code");
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        return results;
    }

    public static void main(String[] args) throws InterruptedException {
        String[] results = showBug();
        for (String result : results) {
            System.out.println(result);
        }
    }
}