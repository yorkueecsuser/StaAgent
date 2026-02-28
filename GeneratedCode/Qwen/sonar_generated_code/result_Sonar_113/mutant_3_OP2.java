class ThreadWaitNotifyBug {

    public void showBug() {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });

        // Duplicate of the thread creation and start process
        Thread myThreadDuplicate = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread duplicate is running");
            }
        });

        try {
            myThread.start();
            myThreadDuplicate.start(); // Start the duplicated thread

            myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        bugDemo.showBug();
    }
}