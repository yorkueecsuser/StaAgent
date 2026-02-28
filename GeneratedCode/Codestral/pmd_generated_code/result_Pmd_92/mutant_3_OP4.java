class UsingExecutorService {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);

        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            // Unreachable code
            executorService.submit(() -> System.out.println("This code will never execute."));
        } else {
            executorService.submit(() -> System.out.println("Hello!"));
        }
    }
}