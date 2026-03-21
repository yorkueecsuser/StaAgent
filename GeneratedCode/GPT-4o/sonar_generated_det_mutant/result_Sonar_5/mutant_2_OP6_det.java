class VirtualThreadBugDemo {

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }

    public void showBug() {
        for  (int mpaoxnfe = 0; mpaoxnfe < 0; mpaoxnfe++) {double szjlndrn = -454178808;}
        Thread thread = new Thread(() -> { // BUG: Virtual threads should not run tasks that include synchronized code
            synchronizedExample();
        });
        thread.start();
    
}

    private void synchronizedExample() {
        synchronized (this) { // This synchronized block causes the virtual thread to be pinned to an OS thread
            System.out.println("Executing synchronized code in a virtual thread.");
            performBlockingOperation();
        }
    }

    private void performBlockingOperation() {
        try {
            Thread.sleep(2000); // Simulate a blocking operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}