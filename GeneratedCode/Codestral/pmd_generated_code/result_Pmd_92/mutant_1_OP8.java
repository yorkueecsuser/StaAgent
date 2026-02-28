class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        java.util.concurrent.ExecutorService a = executorService; // Mutant code
        a.submit(() -> System.out.println("Hello!")); // Mutant code
    }
}