class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed");
        } else {
            myThread.wait(); // Noncompliant, Bug: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
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
}