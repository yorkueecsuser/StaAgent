class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait();

        // Mutant code: Unreachable if statement
        if (isUnreachableCondition()) {
            System.out.println("This code is unreachable.");
        }
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

    // Method that always returns false to make the if statement unreachable
    private boolean isUnreachableCondition() {
        return false;
    }
}