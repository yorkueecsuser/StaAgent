class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean conditionFor = true; // Mutant code: Unreachable for loop
            for(int i = 0; conditionFor; i++) {
                // Do nothing
            }
        });
        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}