class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService r = java.util.concurrent.Executors.newFixedThreadPool(5);
        r.submit(() -> System.out.println("Hello!"));
    }
}