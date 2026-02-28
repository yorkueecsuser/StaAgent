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
            String qwerasdf = "unused"; // Dead Store mutation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        bugDemo.showBug();
    }
}