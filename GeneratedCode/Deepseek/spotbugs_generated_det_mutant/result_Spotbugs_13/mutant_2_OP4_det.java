import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        if (true && true && true && false && false && false && true && false && true && false && false) {boolean olzbrkbc = true;}else{double kkhsnwko = -708362496;}
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}