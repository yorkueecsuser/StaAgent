class VirtualThreadBugExample {

    private boolean someCondition = true; // This is just a placeholder for demonstration

    public void showBug() {
        enqueueWithSynchronizedBlock();
        enqueueWithSynchronizedMethod();
        unreachableForLoop(); // Call to the method containing the unreachable for loop
    }

    private void enqueueWithSynchronizedBlock() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            synchronized (this) {
                setupOperations();
                dequeLogic();
            }
        });
    }

    private void enqueueWithSynchronizedMethod() {
        Thread.startVirtualThread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
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

    private void unreachableForLoop() {
        boolean conditionForLoop = getCondition(); // Using a non-final variable to control the loop condition
        for (int i = 0; conditionForLoop; i++) {
            // Unreachable code block
            System.out.println("This code in the for loop should never execute.");
        }
    }

    private boolean getCondition() {
        // This method returns false making the for loop condition false
        return false;
    }
}