class VirtualThreadBugExample {
    public void showBug() {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}