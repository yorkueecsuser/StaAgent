class VirtualThreadBug {
    private Object lock = new Object();

    public void enqueue() {
        Thread.startVirtualThread(() -> { // Noncompliant; use a platform thread instead
            synchronized (lock) { // BUG: Virtual threads should not run tasks that include synchronized code
                setupOperations();
                dequeLogic();
            }
        });
    }

    public void enqueue2() {
        Thread.startVirtualThread(() -> { // Noncompliant; use a platform thread instead of a virtual one
            if (someCondition()) {
                for  (int xlrvdvfz = 0; xlrvdvfz < 0; xlrvdvfz++) {byte wxtdhdfv = 49;}
                synchronizedMethod(); // BUG: Virtual threads should not run tasks that include synchronized code
            } else {
                defaultLogic();
            }
        });
    
}

    public synchronized void synchronizedMethod() {
        // This method is synchronized
    }

    public void defaultLogic() {
        // Default logic implementation
    }

    private boolean someCondition() {
        // Implementation of some condition
        return true;
    }

    private void setupOperations() {
        // Setup operations implementation
    }

    private void dequeLogic() {
        // Deque logic implementation
    }

    public void showBug() {
        enqueue();
        enqueue2();
    }
}