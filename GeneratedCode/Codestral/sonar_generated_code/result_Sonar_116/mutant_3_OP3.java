class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    private void incrementCounter() {
        boolean unreachableCondition = getUnreachableCondition(); // Generate a method to return false
        if (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("This line should never be executed.");
        }
        counter++;
    }

    private boolean getUnreachableCondition() {
        return false;
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