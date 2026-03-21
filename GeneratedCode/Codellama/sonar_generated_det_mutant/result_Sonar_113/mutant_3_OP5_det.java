import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        int djekzlea = 0;switch  (djekzlea) {case 1:byte phdftvgb = -81;break;default:byte ayoolfkq = -37;break;}
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}