import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Mutated code: Replaced single thread execution with a do-while loop that executes the task multiple times
        int i = 0;
        do {
            executor.execute(() -> {
                org.junit.Assert.assertTrue(false);
            });
            i++;
        } while (i < 3); // The loop will execute the task 3 times

        executor.shutdown();
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}