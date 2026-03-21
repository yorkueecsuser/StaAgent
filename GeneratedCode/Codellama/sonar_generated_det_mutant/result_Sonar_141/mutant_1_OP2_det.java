import java.util.concurrent.ScheduledThreadPoolExecutor;

class ScheduledThreadPoolExecutorExample {
public static void main(String [] args){
    ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0);
    executor = new ScheduledThreadPoolExecutor(0);
    executor.setCorePoolSize(0);
    executor.execute(()-> System.out.println("Hello, world!"));
}
}