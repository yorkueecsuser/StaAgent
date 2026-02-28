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
}

// Mutated version with a renamed variable
class VirtualThreadBugExampleMutant {

    private boolean x = true; // Renamed variable

    public void showBug() {
        enqueueWithSynchronizedBlock();
        enqueueWithSynchronizedMethod();
    }

    private void enqueueWithSynchronizedBlock() {
        Thread.startVirtualThread(() -> { 
            synchronized (this) {
                setupOperations();
                dequeLogic();
            }
        });
    }

    private void enqueueWithSynchronizedMethod() {
        Thread.startVirtualThread(() -> { 
            if (x) { // Renamed variable used here
                synchronizedMethod();
            } else {
                defaultLogic();
            }
        });
    }

    private void setupOperations() {
        System.out.println("Setting up operations...");
    }

    private void dequeLogic() {
        System.out.println("Performing dequeue logic...");
    }

    private synchronized void synchronizedMethod() {
        System.out.println("Executing synchronized method...");
    }

    private void defaultLogic() {
        System.out.println("Executing default logic...");
    }
}