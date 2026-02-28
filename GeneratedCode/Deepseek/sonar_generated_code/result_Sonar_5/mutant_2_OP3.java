import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;

class VirtualThreadBug {
    private Object lock = new Object();
    private Random random = new Random();

    public void showBug() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            synchronized (lock) { // Noncompliant; use a platform thread instead
                System.out.println("setupOperations");
                System.out.println("dequeLogic");
                if (random.nextBoolean()) { // Adding unreachable if statement
                    System.out.println("This statement will never be executed, hence it's unreachable");
                }
            }
        });
    }

    public void showBug2() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            if (Math.random() > 0.5) { // Noncompliant; use a platform thread instead of a virtual one
                synchronizedMethod();
            } else {
                defaultLogic();
                if (random.nextBoolean()) { // Adding unreachable if statement
                    System.out.println("This statement will never be executed, hence it's unreachable");
                }
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