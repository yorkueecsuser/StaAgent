import java.util.ArrayList;
import java.util.List;

class NotifyBug {
    private final List<Thread> w = new ArrayList<>(); // Renamed "waitingThreads" to "w"

    public void addWaitingThread(Thread thread) {
        synchronized (this) {
            w.add(thread); // Updated "waitingThreads" to "w"
        }
    }

    public void notifyOneThread() {
        synchronized (this) {
            if (!w.isEmpty()) { // Updated "waitingThreads" to "w"
                w.get(0).notify(); // BUG: UseNotifyAllInsteadOfNotify
                w.remove(0); // Updated "waitingThreads" to "w"
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