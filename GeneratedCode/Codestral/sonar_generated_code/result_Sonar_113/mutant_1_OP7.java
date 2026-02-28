class ThreadBug {

    private static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();

        // Insert unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block of code is unreachable
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
}