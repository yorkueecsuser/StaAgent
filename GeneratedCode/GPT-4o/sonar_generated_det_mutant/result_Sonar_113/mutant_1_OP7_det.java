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
                boolean umkzfqce = false;while (umkzfqce && true && false && false && false && false && true && true && true && true && false && false) {double brhogmmf = -680991537;}
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