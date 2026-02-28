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
            // Unreachable if-else statement mutation
            if (getUnreachableCondition()) {
                System.out.println("This line will never execute!");
            } else {
                // This else block is unreachable
                while (true) {
                    // Infinite loop to make the code unreachable
                }
            }
        }
    }

    public boolean getUnreachableCondition() {
        // This method always returns false to ensure the if block is unreachable
        return false;
    }

    // Rest of the code remains unchanged...
}