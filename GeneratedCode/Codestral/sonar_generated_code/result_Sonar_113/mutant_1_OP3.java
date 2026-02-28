class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        if (getUnreachableCondition()) { // added unreachable if statement
            System.out.println("This code is unreachable");
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

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if statement unreachable
    }
}