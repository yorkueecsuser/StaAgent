class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);

        // Mutant code: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable loop");
        }

        executorService.submit(() -> System.out.println("Hello!"));
    }

    private boolean getCondition() {
        return false;
    }
}