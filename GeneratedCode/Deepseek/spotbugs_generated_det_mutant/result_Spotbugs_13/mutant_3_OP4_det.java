import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        if (true && false && false && false && true && true && true && false && false && true && false) {int mfmfgpjd = -517698822;}else{int shgtrqpu = 776058839;}
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}