import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        boolean fdimjiwu = false;while (fdimjiwu && false && false && true && true && false && true && false && true && true && false && false) {float rlotwkdl = -192921471;}
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}