class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    private void incrementCounter() {
        // Inserting an unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
            System.out.println("This is an unreachable loop");
        }
        counter++;
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