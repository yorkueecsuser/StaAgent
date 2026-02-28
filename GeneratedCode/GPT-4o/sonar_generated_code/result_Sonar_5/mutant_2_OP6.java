class VirtualThreadBugExample {

    private boolean someCondition = true; // This is just a placeholder for demonstration

    public void showBug() {
        enqueueWithSynchronizedBlock();
        enqueueWithSynchronizedMethod();
    }

    private void enqueueWithSynchronizedBlock() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            synchronized (this) {
                setupOperations();
                dequeLogic();
            }
        });

        // Unreachable for loop using a non-final variable for the condition
        boolean conditionForLoop = getCondition();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This code is unreachable.");
        }
    }

    private void enqueueWithSynchronizedMethod() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            if (someCondition) {
                synchronizedMethod(); // This method is synchronized, which will pin the virtual thread to an OS thread
            } else {
                defaultLogic();
            }
        });
        
        // Unreachable for loop using a non-final variable for the condition
        boolean conditionForLoop = getCondition();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This code is unreachable.");
        }
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
    
    private boolean getCondition() {
        // Stub method to return a condition that is always false
        return false;
    }
}