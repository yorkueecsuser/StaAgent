class VirtualThreadBugExample {
    public void showBug() {
        String unusedVariable = ""; // Dead Store mutation
        Thread thread = Thread.ofVirtual().start(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}