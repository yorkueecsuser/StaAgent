import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        if (false && true && false && true && false && true && false && false && false && false && false) {float tdlgbvel = 443417079;}
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}