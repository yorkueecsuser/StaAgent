import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));

        // Mutant code: Unused variable declaration (Dead Store)
        int qwertyui = 0;
    }
}