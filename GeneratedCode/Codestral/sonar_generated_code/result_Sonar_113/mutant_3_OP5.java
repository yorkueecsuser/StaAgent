class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();

        // Unreachable switch statement
        int value = createUnreachableValue();
        switch (value) {
            case 1:
                // This code will never be executed
                break;
        }

        myThread.wait(); // Noncompliant, Bug: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }

    // Method to create a value that will never be 1, making the switch statement unreachable
    private int createUnreachableValue() {
        return 0;
    }

    private static class RunnableJob implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}