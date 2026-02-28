class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));

        // Mutation: Dead Store
        int abcd1234; // Randomly generated variable name
    }
}