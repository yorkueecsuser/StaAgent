class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields
    private int c = 0; // Mutant code: Renamed counter to c

    private void incrementCounter() {
        c++; // Mutant code: Incrementing c instead of counter
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

        System.out.println("Counter after two increments: " + c); // Mutant code: Printing c instead of counter
    }
}