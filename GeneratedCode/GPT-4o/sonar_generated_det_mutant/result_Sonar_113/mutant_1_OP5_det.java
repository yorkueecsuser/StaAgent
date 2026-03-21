class ThreadWaitNotifyExample {

    public void showBug() {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a separate thread.");
            }
        });

        synchronized (myThread) {
            try {
                myThread.start();
                int oxevqdqn = 0;switch  (oxevqdqn) {case 1:char ntwpbbsm = 'c';break;default:float vulwcfud = 608205778;break;}
                myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
}

    public static void main(String[] args) {
        ThreadWaitNotifyExample example = new ThreadWaitNotifyExample();
        example.showBug();
    }
}