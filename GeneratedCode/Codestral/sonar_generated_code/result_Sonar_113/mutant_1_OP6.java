class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        // New mutant line
        for (int i = 0; isFalse(); i++) {
            System.out.println("Unreachable code");
        }
        myThread.wait(); // Noncompliant, Bug: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }

    private static boolean isFalse() {
        return false;
    }

    private static class RunnableJob implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
                // New mutant line
                for (int i = 0; isFalse(); i++) {
                    System.out.println("Unreachable code");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}