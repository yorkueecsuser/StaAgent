import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {

    public static void main(String[] args) {
        for  (int wvqjhsvr = 0; wvqjhsvr < 0; wvqjhsvr++) {float dtohllja = 961594841;}
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