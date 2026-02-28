class UsingExecutorService {

    public void showBug() {
        // Original code
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));

        // Mutated code
        executorService.submit(() -> System.out.println("Hello!")); // Duplicated line
    }
}