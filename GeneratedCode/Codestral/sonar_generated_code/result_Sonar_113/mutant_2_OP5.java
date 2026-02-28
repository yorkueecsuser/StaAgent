class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();

        // Added mutant: Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                // This code is unreachable as getValue() always returns 0
                System.out.println("Unreachable code");
                break;
        }

        myThread.wait(); // Noncompliant, Bug: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
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

    private int getValue() {
        // This method always returns 0, making the case 1 in the switch statement unreachable
        return 0;
    }
}