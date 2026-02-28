class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
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

            boolean unreachableCondition = false; // This condition is always false
            while (unreachableCondition) { // This while loop is unreachable
                System.out.println("This line should never be executed.");
            }
        }
    }
}