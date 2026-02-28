import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class VirtualThreadBug {
    private Object lock = new Object();

    public void showBug() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            synchronized (lock) { // Noncompliant; use a platform thread instead
                System.out.println("setupOperations");
                System.out.println("dequeLogic");
            }
        });

        // Unreachable while loop added here
        boolean condition = Math.random() > 0.5;
        while (condition == false) {
            System.out.println("Unreachable loop");
        }
    }

    public void showBug2() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            if (Math.random() > 0.5) { // Noncompliant; use a platform thread instead of a virtual one
                synchronizedMethod();
            } else {
                defaultLogic();
            }
        });

        // Unreachable while loop added here
        boolean condition = Math.random() > 0.5;
        while (condition == false) {
            System.out.println("Unreachable loop");
        }
    }

    synchronized void synchronizedMethod() {
        System.out.println("synchronizedMethod");
    }

    void defaultLogic() {
        System.out.println("defaultLogic");
    }
}