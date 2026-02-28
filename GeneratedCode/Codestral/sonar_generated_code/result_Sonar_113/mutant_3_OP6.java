class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block is unreachable
        }
        myThread.wait(); // Noncompliant, Bug: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }

    private boolean getCondition() {
        return false;
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