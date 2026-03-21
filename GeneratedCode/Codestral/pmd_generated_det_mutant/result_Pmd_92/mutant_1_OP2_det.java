class UsingExecutorService {
public void showBug() {
    java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
    executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
    executorService.submit(()-> System.out.println("Hello!"));
}
}