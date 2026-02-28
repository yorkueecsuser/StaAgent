import java.lang.InterruptedException;

class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();

        boolean unreachableCondition = getUnreachableCondition(); // Added non-compile-time constant condition
        if (unreachableCondition) { // Unreachable if-else statement
            System.out.println("This code will never be executed.");
        } else {
            myThread.wait(); // Noncompliant, Bug: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        }
    }

    private boolean getUnreachableCondition() { // Non-compile-time constant method
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