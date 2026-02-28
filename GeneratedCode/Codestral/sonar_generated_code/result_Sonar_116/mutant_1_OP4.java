class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    private void incrementCounter() {
        counter++;

        // Mutated: Adding an unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            // This block is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This is the original block that will be executed
            counter++;
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::incrementCounter);
        Thread thread2 = new Thread(this::incrementCounter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter after two increments: " + counter);
    }
}