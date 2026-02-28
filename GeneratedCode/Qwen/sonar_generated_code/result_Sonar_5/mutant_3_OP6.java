import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class VirtualThreadSynchronizationBug {

    private final Lock lock = new ReentrantLock();

    public void showBug1() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            synchronized (this) {
                setupOperations();
                dequeLogic();
            }
            // Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because conditionFor is always false
            }
        });
    }

    public void showBug2() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            if (someCondition()) {
                synchronizedMethod();
            } else {
                defaultLogic();
            }
            // Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because conditionFor is always false
            }
        });
    }

    private void setupOperations() {
        // Simulate some setup operations
        System.out.println("Setup operations");
    }

    private void dequeLogic() {
        // Simulate some deque logic
        System.out.println("Deque logic");
    }

    private boolean someCondition() {
        // Simulate some condition check
        return true;
    }

    private synchronized void synchronizedMethod() {
        // Simulate a synchronized method
        System.out.println("Synchronized method");
    }

    private void defaultLogic() {
        // Simulate default logic
        System.out.println("Default logic");
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        VirtualThreadSynchronizationBug bugDemo = new VirtualThreadSynchronizationBug();
        bugDemo.showBug1();
        bugDemo.showBug2();
    }
}