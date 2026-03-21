import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
public void showBug() {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor = Executors.newSingleThreadExecutor();
    executor.execute(()-> { org.junit.Assert.assertTrue(false); });
    executor.shutdown();
}

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}