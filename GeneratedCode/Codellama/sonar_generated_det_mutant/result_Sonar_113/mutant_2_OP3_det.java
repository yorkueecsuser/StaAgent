import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        if (true && false && true && false && true && true && false && true && true && true && false) {double tlmdzoql = -871371955;}
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}