import java.util.ArrayList;
import java.util.List;

class NotifyBug {
    private final List<Thread> wThreads = new ArrayList<>(); // Mutant: Renamed waitingThreads to wThreads

    public void addWaitingThread(Thread thread) {
        synchronized (this) {
            wThreads.add(thread); // Updated to reflect the new variable name
        }
    }

    public void notifyOneThread() {
        synchronized (this) {
            if (!wThreads.isEmpty()) {
                wThreads.get(0).notify();
                wThreads.remove(0);
            }
        }
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