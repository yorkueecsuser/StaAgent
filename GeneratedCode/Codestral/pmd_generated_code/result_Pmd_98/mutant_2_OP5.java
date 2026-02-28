import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class NotifyBug {
    private final List<Thread> waitingThreads = new ArrayList<>();

    public void addWaitingThread(Thread thread) {
        synchronized (this) {
            waitingThreads.add(thread);
        }
    }

    public void notifyOneThread() {
        synchronized (this) {
            if (!waitingThreads.isEmpty()) {
                waitingThreads.get(0).notify();
                waitingThreads.remove(0);
            }
            // Unreachable switch statement mutant
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    // This code is unreachable
                    System.out.println("This is an unreachable case.");
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        // This method returns a value that is not used in the switch cases
        Random rand = new Random();
        return rand.nextInt(2) + 2; // This will return either 2 or 3
    }

    public void showBug() {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                synchronized (this) {
                    try {
                        addWaitingThread(Thread.currentThread());
                        Thread.currentThread().wait();
                        System.out.println("Thread " + Thread.currentThread().getId() + " is notified.");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            thread.start();
        }

        notifyOneThread();
    }

    public static void main(String[] args) {
        NotifyBug bug = new NotifyBug();
        bug.showBug();
    }
}