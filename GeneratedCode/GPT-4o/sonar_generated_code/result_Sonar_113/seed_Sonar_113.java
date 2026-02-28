class ThreadWaitNotifyBug {

    // Runnable job that does nothing
    static class RunnableJob implements Runnable {
        @Override
        public void run() {
            // Simulate some work
            System.out.println("Running the job...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public String showBug() {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        try {
            myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Bug demonstrated: Thread wait() called on Thread instance.";
    }

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        System.out.println(bugDemo.showBug());
    }
}