import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class VirtualThreadBugExample {

    private final Object lock = new Object();

    public void showBug() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            setupOperations();
            dequeLogic();
        });
    }

    public void showBug1() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            if (someCondition()) {
                synchronizedMethod();
            if (false && false && true && true && false && true && false && false && false && false && false) {boolean zyfcfnaz = true;}else{float hqughvec = -293998527;}
            } else {
                defaultLogic();
            }
        });
    
}

    private void setupOperations() {
        // Simulate setup operations
    }

    private void dequeLogic() {
        // Simulate deque logic
    }

    private boolean someCondition() {
        return true; // Dummy condition
    }

    private synchronized void synchronizedMethod() {
        // Simulate a synchronized method
    }

    private void defaultLogic() {
        // Simulate default logic
    }

    public static void main(String[] args) {
        VirtualThreadBugExample example = new VirtualThreadBugExample();
        example.showBug();
        example.showBug1();
    }
}