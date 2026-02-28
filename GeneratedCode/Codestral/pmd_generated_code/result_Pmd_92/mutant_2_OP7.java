class UsingExecutorService {

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);

        // Mutant: Unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("This code is unreachable!");
        }

        executorService.submit(() -> System.out.println("Hello!"));
    }
}