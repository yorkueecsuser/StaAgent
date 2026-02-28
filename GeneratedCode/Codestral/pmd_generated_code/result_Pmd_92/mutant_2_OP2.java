class UsingExecutorService {

    public void showBug() {
        // Original code
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));

        // Mutant code: Duplication of the assignment statement
        java.util.concurrent.ExecutorService executorServiceDuplicate = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorServiceDuplicate.submit(() -> System.out.println("Hello, again!"));
    }
}