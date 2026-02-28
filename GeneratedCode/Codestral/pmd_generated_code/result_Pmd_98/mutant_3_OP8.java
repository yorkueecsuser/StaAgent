import java.util.ArrayList;
import java.util.List;

class NotifyBug {
    private final List<Thread> t = new ArrayList<>();

    public void addWaitingThread(Thread thread) {
        synchronized (this) {
            t.add(thread);
        }
    }

    public void notifyOneThread() {
        synchronized (this) {
            if (!t.isEmpty()) {
                t.get(0).notify(); // BUG: UseNotifyAllInsteadOfNotify
                t.remove(0);
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