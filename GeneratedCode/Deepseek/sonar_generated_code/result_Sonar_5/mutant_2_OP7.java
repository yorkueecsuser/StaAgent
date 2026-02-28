import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class VirtualThreadBug {
    private Object lock = new Object();
    private boolean unreachableWhileLoop = false;

    public void showBug() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            synchronized (lock) {
                System.out.println("setupOperations");
                System.out.println("dequeLogic");
            }
        });
    }

    public void showBug2() {
        while(unreachableWhileLoop) { // Unreachable while loop
            // Unreachable code
            System.out.println("Unreachable code");
        }
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            if (Math.random() > 0.5) {
                synchronizedMethod();
            } else {
                defaultLogic();
            }
        });
    }

    synchronized void synchronizedMethod() {
        System.out.println("synchronizedMethod");
    }

    void defaultLogic() {
        System.out.println("defaultLogic");
    }
}