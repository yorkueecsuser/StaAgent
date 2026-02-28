class MyThread implements Runnable {
    Object lock = new Object();

    @Override
    public void run() {
        synchronized(lock) {
            // This is the bug line
            lock.notify();  // Noncompliant, should be notifyAll()

            // Mutant: Unreachable switch statement
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("This is an unreachable switch case");
                    break;
            }
        }
    }

    // Method to show the bug
    public void showBug() {
        Thread thread = new Thread(this);
        thread.start();
        try {
            // Waiting for the thread to be notified
            lock.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Dummy method to return an unreachable value
    private int getUnreachableValue() {
        return -1;  // Always returns a value that is not 1
    }
}