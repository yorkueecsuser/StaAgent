import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExampleBug {
public void showBug() {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor = Executors.newSingleThreadExecutor();
    executor.submit(new Runnable() { @ Override public void run() { try { assert false : "This assertion will not be caught by JUnit"; } finally { executor.shutdown(); } } });
}

    public static void main(String[] args) {
        ExampleBug example = new ExampleBug();
        example.showBug();
    }
}