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
        });

        // Inserted unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never run");
        } else {
            System.out.println("This will also never run");
        }
    }

    public void showBug2() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            if (someCondition()) {
                synchronizedMethod();
            } else {
                defaultLogic();
            }
        });

        // Inserted unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never run either");
        } else {
            System.out.println("This will also never run either");
        }
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
        // This method always returns false to ensure the branches are unreachable
        return false;
    }

    public static void main(String[] args) {
        VirtualThreadSynchronizationBug bugDemo = new VirtualThreadSynchronizationBug();
        bugDemo.showBug1();
        bugDemo.showBug2();
    }
}