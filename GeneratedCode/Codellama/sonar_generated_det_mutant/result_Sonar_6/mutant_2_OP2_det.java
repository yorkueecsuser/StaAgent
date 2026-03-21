import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class VirtualThreadBug {
public static void main(String [] args){
    ExecutorService executor = Executors.newCachedThreadPool();
    Runnable task =() -> { System.out.println("Task started"); try { Thread.sleep(1000); } catch(InterruptedException e){ System.out.println("Task interrupted"); } System.out.println("Task finished"); };
    task =() -> { System.out.println("Task started"); try { Thread.sleep(1000); } catch(InterruptedException e){ System.out.println("Task interrupted"); } System.out.println("Task finished"); };
    Thread t = Thread.ofVirtual().unstarted(task);
    t.setPriority(1);
    t.setDaemon(false);
    t.setDaemon(true);
    t.start();
    var threadGroup = t.getThreadGroup();
    executor.shutdown();
}
}