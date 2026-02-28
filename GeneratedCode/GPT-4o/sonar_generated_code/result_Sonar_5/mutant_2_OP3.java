class VirtualThreadBugExample {
    
    private boolean someCondition = true; // This is just a placeholder for demonstration

    public void showBug() {
        enqueueWithSynchronizedBlock();
        enqueueWithSynchronizedMethod();
    }

    private void enqueueWithSynchronizedBlock() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This code is unreachable.");
            }
            synchronized (this) {
                setupOperations();
                dequeLogic();
            }
        });
    }

    private void enqueueWithSynchronizedMethod() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This code is unreachable.");
            }
            if (someCondition) {
                synchronizedMethod(); // This method is synchronized, which will pin the virtual thread to an OS thread
            } else {
                defaultLogic();
            }
        });
    }

    private void setupOperations() {
        // Simulating setup operations
        System.out.println("Setting up operations...");
    }

    private void dequeLogic() {
        // Simulating deque operations
        System.out.println("Performing dequeue logic...");
    }

    private synchronized void synchronizedMethod() {
        // Simulating a synchronized method
        System.out.println("Executing synchronized method...");
    }

    private void defaultLogic() {
        // Simulating default logic
        System.out.println("Executing default logic...");
    }
    
    // This method returns a condition that is always false, ensuring the if statement is unreachable
    private boolean getUnreachableCondition() {
        return false; // This is not a compile-time constant as it's part of a non-final method
    }
}