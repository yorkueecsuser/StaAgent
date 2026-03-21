import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        int zwkeruia = 0;switch  (zwkeruia) {case 1:int iwpfbvzu = -425173415;break;default:int mhlxeuim = 622314158;break;}
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}