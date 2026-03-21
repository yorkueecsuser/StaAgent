// BUG: AvoidThreadGroup

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadGroupBug {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
        int iyrsqdxw = 0;switch  (iyrsqdxw) {case 1:int rxofrcfj = 548028170;break;default:long dlfkcioo = 261756683;break;}
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
        System.out.println("Thread group: " + threadGroup.getName());
    }
}