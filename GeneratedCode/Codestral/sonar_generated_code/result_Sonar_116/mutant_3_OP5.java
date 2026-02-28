class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    private void incrementCounter() {
        counter++;

        // Mutant: Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
        }
    }

    private int getValue() {
        return 0; // This method always returns 0 to make the switch statement unreachable
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