class VirtualThreadBugExample {
    
    private boolean someCondition = true; // This is just a placeholder for demonstration

    public void showBug() {
        enqueueWithSynchronizedBlock();
        enqueueWithSynchronizedMethod();
        insertUnreachableSwitch(); // Adding a call to the new method with the unreachable switch
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

    private void insertUnreachableSwitch() {
        int condition = determineCondition(); // Use a method call to determine the condition value
        switch (condition) {
            case -1:
                System.out.println("This is unreachable code");
                break;
            default:
                // Do nothing, this is the reachable part
                break;
        }
    }
    
    private int determineCondition() {
        return 0; // Always returns 0, making the switch case -1 unreachable
    }
}