import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

class JUnitThreadBug {
    public void showBug() {
        int xyzabcde; // Dead Store
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
            org.junit.Assert.assertTrue(false);
        });
        executor.shutdown();
    }

    // Add a method to generate a random string of eight characters
    private String generateRandomString() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        String deadVariable = bug.generateRandomString(); // Generate a random variable name
        int deadVariableValue = 0; // No usage of the dead variable
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}