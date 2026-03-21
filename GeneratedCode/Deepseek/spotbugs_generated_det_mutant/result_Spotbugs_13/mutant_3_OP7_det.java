import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        boolean pohigjcg = false;while (pohigjcg && false && false && true && false && true && true && false && true && true && false && false) {int ajkoahol = -67187684;}
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}