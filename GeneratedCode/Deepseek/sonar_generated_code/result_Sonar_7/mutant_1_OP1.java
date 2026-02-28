class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        String s = "aabbccdd"; // Dead store mutation. The variable's' is declared and unused and not used later in the code.
        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}