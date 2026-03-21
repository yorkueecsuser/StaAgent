import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        int gseousex = 0;switch  (gseousex) {case 1:long gfpfxpii = -220180011;break;default:boolean ipzsndzu = false;break;}
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}