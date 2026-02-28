class UsingExecutorService {

    public void showBug() {
        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));
    }

    // Method to return false for the unreachable for loop condition
    private boolean getCondition() {
        return false;
    }
}