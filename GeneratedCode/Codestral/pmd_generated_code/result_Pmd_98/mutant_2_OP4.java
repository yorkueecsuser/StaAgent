import java.util.ArrayList;
import java.util.List;

class NotifyBug {
    private final List<Thread> waitingThreads = new ArrayList<>();

    public void addWaitingThread(Thread thread) {
        synchronized (this) {
            waitingThreads.add(thread);
        }
    }

    public boolean getFalseCondition() { // added method to generate false condition
        return false;
    }

    public void notifyOneThread() {
        synchronized (this) {
            if (!waitingThreads.isEmpty()) {
                waitingThreads.get(0).notify();
                waitingThreads.remove(0);
                if (getFalseCondition()) { // unreachable if-else statement
                    System.out.println("This line will never be executed.");
                } else {
                    System.out.println("This line is always executed.");
                }
            }
        }
    }

    // Rest of the code remains the same
}