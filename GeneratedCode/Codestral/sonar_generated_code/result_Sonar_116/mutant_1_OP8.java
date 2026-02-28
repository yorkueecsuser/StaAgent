class MutableServletBug {
    private int counter = 0; // Original variable
    private int x = counter; // Mutated variable

    private void incrementCounter() {
        counter++;
        x++;
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
        System.out.println("X after two increments: " + x);
    }
}