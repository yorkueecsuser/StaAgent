class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    private void incrementCounter() {
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                counter++;
                break;
        }
        counter++;
    }

    private int getUnreachableValue() {
        return 0; // This will always return a value that's not 1, making the switch statement unreachable
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