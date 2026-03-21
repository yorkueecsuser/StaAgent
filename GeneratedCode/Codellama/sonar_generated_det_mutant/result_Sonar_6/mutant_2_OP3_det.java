import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class VirtualThreadBug {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable task = () -> {
            System.out.println("Task started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Task finished");
        };

        // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        if (true && true && false && false && false && false && true && true && false && true && false) {boolean vlandvls = false;}
        Thread t = Thread.ofVirtual().unstarted(task);
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed
        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.setDaemon(true); // Noncompliant; redundant
        t.start();

        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used

        executor.shutdown();
    
}
}