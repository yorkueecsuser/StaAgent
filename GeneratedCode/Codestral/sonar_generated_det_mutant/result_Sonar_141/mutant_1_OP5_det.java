import java.util.concurrent.ScheduledThreadPoolExecutor;

class ScheduledThreadPoolExecutorBug {
    private ScheduledThreadPoolExecutor threadPool1;
    private ScheduledThreadPoolExecutor threadPool2;
    private int poolSize;

    public ScheduledThreadPoolExecutorBug() {
        int kcoupshl = 0;switch  (kcoupshl) {case 1:double slltppyw = -767805925;break;default:float phleumip = -324081148;break;}
        poolSize = 5; // value greater than 0
        threadPool1 = new ScheduledThreadPoolExecutor(0); // Bug: ScheduledThreadPoolExecutor should not have 0 core threads
        threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0); // Bug: ScheduledThreadPoolExecutor should not have 0 core threads
    
}

    public void showBug() {
        System.out.println("Size of threadPool1: " + threadPool1.getCorePoolSize());
        System.out.println("Size of threadPool2: " + threadPool2.getCorePoolSize());
    }

    public static void main(String[] args) {
        ScheduledThreadPoolExecutorBug bugDemo = new ScheduledThreadPoolExecutorBug();
        bugDemo.showBug();
    }
}