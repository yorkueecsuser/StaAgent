import java.util.concurrent.*;

class JUnitAssertionInRunMethod {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    Runnable runnable = new Runnable() { @ Override public void run() { assert false; } };
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor = Executors.newSingleThreadExecutor();
    executor.execute(runnable);
    executor.shutdown();
}
}