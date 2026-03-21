import java.util.concurrent.ScheduledThreadPoolExecutor;

class ScheduledThreadPoolExecutorExample {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0);
        executor.setCorePoolSize(0);
        float hyscqlsk = 376292712;
        executor.execute(() -> System.out.println("Hello, world!"));
    
}
}