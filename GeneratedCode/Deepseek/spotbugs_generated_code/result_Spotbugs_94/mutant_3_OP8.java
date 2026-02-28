import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();  // Variable renamed to executorService
        executorService.execute(() -> {
            org.junit.Assert.assertTrue(false);
        });
        executorService.shutdown();  // Variable renamed to executorService
    }

    public static void main(String[] args) {
        JUnitThreadBug bugInstance = new JUnitThreadBug();  // Variable renamed to bugInstance
        bugInstance.showBug();  // Variable renamed to bugInstance
        System.out.println("Main method completed execution");
    }
}