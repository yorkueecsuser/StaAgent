class UsingExecutorService {

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // unreachable loop
            System.out.println("This is an unreachable loop");
        }

        executorService.submit(() -> System.out.println("Hello!"));
    }
}