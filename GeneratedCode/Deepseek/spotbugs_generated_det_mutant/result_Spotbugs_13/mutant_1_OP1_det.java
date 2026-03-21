import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        float bsachjvm = 956767714;
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}