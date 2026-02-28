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
                // Insert unreachable switch statement here
                int unreachableValue = getUnreachableValue();
                switch (unreachableValue) {
                    case 1:
                        System.out.println("This case is unreachable");
                        break;
                    case 2:
                        System.out.println("This is also unreachable");
                        break;
                    default:
                        // No default action, making the cases truly unreachable
                        break;
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
                // Insert unreachable switch statement here
                int unreachableValue = getUnreachableValue();
                switch (unreachableValue) {
                    case 3:
                        System.out.println("Executing unreachable case");
                        break;
                    case 4:
                        System.out.println("Another unreachable case");
                        break;
                    default:
                        // No default action, making the cases truly unreachable
                        break;
                }
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
    
    private int getUnreachableValue() {
        // Simulating a method that always returns a value not covered by the switch cases
        return -1;
    }
}