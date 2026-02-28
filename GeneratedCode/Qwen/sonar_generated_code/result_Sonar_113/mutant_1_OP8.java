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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mutant code with renamed variable
        Thread x = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });

        try {
            x.start();
            x.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        bugDemo.showBug();
    }
}