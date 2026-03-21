import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        for  (int odyiuaur = 0; odyiuaur < 0; odyiuaur++) {boolean frgklsgq = false;}
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}