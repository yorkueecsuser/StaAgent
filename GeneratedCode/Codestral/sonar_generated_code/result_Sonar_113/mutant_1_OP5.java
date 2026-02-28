class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait();
    }

    private static class RunnableJob implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Add unreachable switch statement
            boolean condition = false;
            switch (getConditionValue(condition)) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never execute.");
                    break;
            }
        }

        // Helper method to dynamically determine the switch condition
        private int getConditionValue(boolean condition) {
            return condition? 1 : 0;
        }
    }
}