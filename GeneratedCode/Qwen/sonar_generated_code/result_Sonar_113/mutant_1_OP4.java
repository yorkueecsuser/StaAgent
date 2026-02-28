class ThreadWaitNotifyBug {

    public void showBug() {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });

        try {
            myThread.start();
            myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances

            // Inserting unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This will never be printed because shouldRun is always false");
            } else {
                System.out.println("This will also never be printed because shouldRun is always false");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime but always returns false
    }

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        bugDemo.showBug();
    }
}