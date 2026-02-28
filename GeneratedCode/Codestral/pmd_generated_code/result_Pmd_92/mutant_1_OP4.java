class UsingExecutorService {

    public void showBug() {
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        if (getUnreachableCondition()) {
            // Unreachable Mutant: Unreachable if-else statement
            executorService.submit(() -> System.out.println("Unreachable code!"));
        } else {
            executorService.submit(() -> System.out.println("Hello!"));
        }
    }

    private boolean getUnreachableCondition() {
        // Always returns false to keep the if-else branch unreachable
        return false;
    }
}