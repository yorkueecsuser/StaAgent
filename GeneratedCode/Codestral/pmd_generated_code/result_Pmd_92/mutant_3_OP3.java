class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> {
            if (getUnreachableCondition()) {
                // Unreachable if statement
                System.out.println("This is an unreachable block.");
            }
            System.out.println("Hello!");
        });
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}