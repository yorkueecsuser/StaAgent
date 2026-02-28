class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // Mutation begins
        Thread renamedThread = thread;
        // Mutation ends
        renamedThread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}