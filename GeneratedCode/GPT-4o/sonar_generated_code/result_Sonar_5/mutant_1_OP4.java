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

                // Inserting an unreachable if-else branch
                boolean condition = getCondition(); // Dynamic condition to prevent compile-time analysis
                if (condition) {
                    System.out.println("This block is unreachable.");
                } else {
                    System.out.println("This is the else block of an unreachable condition.");
                }
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

            // Inserting another unreachable if-else branch
            boolean condition = getCondition(); // Dynamic condition to prevent compile-time analysis
            if (condition) {
                System.out.println("This block is unreachable.");
            } else {
                System.out.println("This is the else block of an unreachable condition.");
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

    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // Always return false to ensure the branch is effectively unreachable
    }
}