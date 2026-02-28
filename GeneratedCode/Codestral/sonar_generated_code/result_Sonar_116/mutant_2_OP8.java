class MutableServletBug {
    private int counter = 0; // Original variable
    private int a = 0; // Mutant: Renamed variable

    private void incrementCounter() {
        counter++;
        a++; // Mutant: Increment the renamed variable
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
        System.out.println("Renamed counter after two increments: " + a);
    }
}