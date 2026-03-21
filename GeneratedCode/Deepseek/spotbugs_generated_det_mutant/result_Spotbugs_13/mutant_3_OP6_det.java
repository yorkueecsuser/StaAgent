import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        for  (int ozfmoohp = 0; ozfmoohp < 0; ozfmoohp++) {float tjvakodr = -367556642;}
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}