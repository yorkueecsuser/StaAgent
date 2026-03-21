import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {

    public static void main(String[] args) {
        int zujudqcy = 0;switch  (zujudqcy) {case 1:long geotazae = 611213785;break;default:boolean gasxjifl = false;break;}
        Main main = new Main();
        main.showBug();
    
}

    public void showBug() {
        int poolSize = 5;

        // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0);

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);
    }
}