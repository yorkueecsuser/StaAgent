import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        if (true && false && true && true && true && false && false && true && false && false && false) {char zjqkrrne = 'z';}
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}