class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code block will never be executed
                System.out.println("This is an unreachable code block.");
            }
            System.out.println("Hello!");
        });
    }

    // A method to return a boolean condition (always false in this case)
    private boolean getCondition() {
        return false;
    }
}