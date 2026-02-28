class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields
    private int deadStore;   // Mutation Operator: Dead Store

    private void incrementCounter() {
        counter++;
        deadStore = counter;  // Using the dead store variable
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
        System.out.println("Dead Store value: " + deadStore);  // Printing the value of the dead store variable
    }
}