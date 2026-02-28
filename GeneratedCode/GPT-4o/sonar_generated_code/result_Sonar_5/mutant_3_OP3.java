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
            // Inserting an unreachable if statement using a non-final variable
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This block is unreachable.");
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
            // Inserting another unreachable if statement using a non-final variable
            boolean anotherUnreachableCondition = getAnotherUnreachableCondition();
            if (anotherUnreachableCondition) {
                System.out.println("This is another unreachable block.");
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

    private boolean getUnreachableCondition() {
        // Always returns false to ensure the block is unreachable
        return false;
    }

    private boolean getAnotherUnreachableCondition() {
        // Always returns false to ensure the block is unreachable
        return false;
    }
}