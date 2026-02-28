import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class VirtualThreadBug {
    private Object lock_ = new Object();

    public void showBug() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            synchronized (lock_) { // Noncompliant; use a platform thread instead
                System.out.println("setupOperations");
                System.out.println("dequeLogic");
            }
        });
    }

    public void showBug2() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            if (Math.random() > 0.5) { // Noncompliant; use a platform thread instead of a virtual one
                synchronizedMethod_();
            } else {
                defaultLogic_();
            }
        });
    }

    synchronized void synchronizedMethod_() {
        System.out.println("synchronizedMethod");
    }

    void defaultLogic_() {
        System.out.println("defaultLogic");
    }
}