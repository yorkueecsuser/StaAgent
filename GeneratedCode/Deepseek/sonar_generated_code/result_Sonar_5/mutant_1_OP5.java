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

        // Added unreachable switch statement
        int randomValue = (int)(Math.random() * 10);
        switch(randomValue) {
            case 0:
                System.out.println("Unreachable");
                break;
            default:
                break;
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

            // Added unreachable switch statement
            int randomValue = (int)(Math.random() * 10);
            switch(randomValue) {
                case 0:
                    System.out.println("Unreachable");
                    break;
                default:
                    break;
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