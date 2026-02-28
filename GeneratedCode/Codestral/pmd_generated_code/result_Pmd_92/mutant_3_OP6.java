class UsingExecutorService {

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                System.out.println("Unreachable code!");
            }
            System.out.println("Hello!");
        });
    }
}