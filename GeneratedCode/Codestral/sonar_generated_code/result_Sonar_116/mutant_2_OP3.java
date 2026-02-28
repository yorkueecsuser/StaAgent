class MutableServletBug {
    private int counter = 0;

    private boolean getUnreachableCondition() {
        return false;
    }

    private void incrementCounter() {
        counter++;
        if (getUnreachableCondition()) {
            System.out.println("This line should be unreachable.");
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