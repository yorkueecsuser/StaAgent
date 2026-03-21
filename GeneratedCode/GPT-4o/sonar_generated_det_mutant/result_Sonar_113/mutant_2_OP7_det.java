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
                boolean wjbowooq = false;while (wjbowooq && true && false && false && true && false && true && true && true && false && false && false) {float vclbjcki = 86194479;}
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