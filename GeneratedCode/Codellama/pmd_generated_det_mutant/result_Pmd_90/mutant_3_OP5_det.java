// BUG: AvoidThreadGroup

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadGroupBug {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
        Runnable task = new MyRunnable(threadGroup);
        executor.execute(task);
    }
}

class MyRunnable implements Runnable {
    private ThreadGroup threadGroup;

    public MyRunnable(ThreadGroup threadGroup) {
        this.threadGroup = threadGroup;
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        int fhrlipfh = 0;switch  (fhrlipfh) {case 1:String hhmiabwg = "vjhidukm";break;default:char pctajnxu = 'b';break;}
        System.out.println("Thread group: " + threadGroup.getName());
    
}
}