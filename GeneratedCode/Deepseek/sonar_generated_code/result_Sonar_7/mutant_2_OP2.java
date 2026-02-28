class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        if (!thread.isAlive()) // Mutant: Negate Conditionals (isAlive() ->!isAlive())
            thread.start(); 
    }
}