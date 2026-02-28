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
                waitingThreads.get(0).notify();
                waitingThreads.remove(0);
            }
            // Mutation: Added unreachable if statement
            if (getUnreachableCondition()) {
                System.out.println("This line should never be executed.");
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

    // Helper method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}