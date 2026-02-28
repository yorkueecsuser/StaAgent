class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread t = new Thread(new RunnableJob()); // Mutated code: Renamed variable `myThread` to `t`
        t.start();
        t.wait(); // Noncompliant, Bug: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
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