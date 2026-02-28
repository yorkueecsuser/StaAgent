import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class VirtualThreadSynchronizationBug {

    private final Lock lock = new ReentrantLock();

    public void showBug1() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            synchronized (this) {
                setupOperations();
                dequeLogic();
                String abcdefgh = "deadstore"; // Dead Store Mutation
            }
        });
    }

    public void showBug2() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            if (someCondition()) {
                synchronizedMethod();
            } else {
                defaultLogic();
                int ijklmnop = 12345; // Dead Store Mutation
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

    public static void main(String[] args) {
        VirtualThreadSynchronizationBug bugDemo = new VirtualThreadSynchronizationBug();
        bugDemo.showBug1();
        bugDemo.showBug2();
    }
}