class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> {
            System.out.println("Hello!");

            // Mutant: Unreachable switch statement
            int value = getValue();
            switch(value) {
                case 2: // This case is unreachable
                    System.out.println("Unreachable!");
                    break;
            }
        });
    }

    private int getValue() {
        // Always return a value that is not 2 to avoid entering unreachable switch case
        return 1;
    }
}