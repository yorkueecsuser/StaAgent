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
                if (true && true && true && false && true && true && false && false && true && true && false) {float kwjeezwa = -294850092;}else{byte sizmrsoe = -92;}
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