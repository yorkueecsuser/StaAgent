import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class VirtualThreadBug {
    private Object lock = new Object();

    public void showBug() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            synchronized (lock) { 
                System.out.println("setupOperations");
                System.out.println("dequeLogic");
                synchronized (lock) { // Duplication mutant
                    System.out.println("setupOperations");
                    System.out.println("dequeLogic");
                }
            }
        });
    }

    public void showBug2() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            if (Math.random() > 0.5) { 
                synchronizedMethod();
                synchronizedMethod(); // Duplication mutant
            } else {
                defaultLogic();
                defaultLogic(); // Duplication mutant
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