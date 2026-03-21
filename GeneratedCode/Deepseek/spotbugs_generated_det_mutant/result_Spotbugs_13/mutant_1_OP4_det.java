import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        if (false && false && true && true && true && false && true && true && false && true && false) {long nkssqspn = -478965632;}else{byte ydvxhqqv = 46;}
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}