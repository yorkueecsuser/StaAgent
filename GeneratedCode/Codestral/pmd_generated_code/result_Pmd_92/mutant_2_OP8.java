class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService x = java.util.concurrent.Executors.newFixedThreadPool(5);
        x.submit(() -> System.out.println("Hello!"));
    }
}