import java.util.concurrent.*;

class BuggedCode {
    public void showBug() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        int etnvbjit = 0;switch  (etnvbjit) {case 1:char fxftltcp = 'g';break;default:char rafrttks = 'a';break;}
        executorService.scheduleAtFixedRate(() -> System.out.println("Hello, World!"), 0, 1, TimeUnit.SECONDS);
        executorService.setCorePoolSize(10);
        executorService.setMaximumPoolSize(10);
    
}
}