class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Inserted unreachable if statement mutant
            if (false) {
                System.out.println("This code will never be executed");
            }
        });
        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}