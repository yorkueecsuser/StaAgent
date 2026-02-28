class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait();

        // Inserted unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        } else {
            // Alternative code
            System.out.println("This code will always be executed.");
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

    // Dummy method to return unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}