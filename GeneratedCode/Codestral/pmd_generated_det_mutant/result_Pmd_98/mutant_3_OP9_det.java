import java.util.ArrayList;
import java.util.List;

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
                waitingThreads.get(0).notify(); // BUG: UseNotifyAllInsteadOfNotify
                waitingThreads.remove(0);
            }
        }
    }

    public void showBug() {
        { int i = 0; do { Thread thread = new Thread(() -> {
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
            thread.start(); i++; } while (i < 5); }

        notifyOneThread();
    }

    public static void main(String[] args) {
        NotifyBug bug = new NotifyBug();
        bug.showBug();
    }
}