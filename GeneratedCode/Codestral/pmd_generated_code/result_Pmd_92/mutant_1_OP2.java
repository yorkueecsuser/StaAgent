class UsingExecutorService {

    public void showBug() {
        // Original code
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));

        // Mutated code: Duplication of the assignment statement
        java.util.concurrent.ExecutorService duplicateExecutorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        duplicateExecutorService.submit(() -> System.out.println("Hello!"));
    }
}