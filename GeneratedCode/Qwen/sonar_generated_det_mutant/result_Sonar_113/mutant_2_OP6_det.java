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
            for  (int uzvwkntx = 0; uzvwkntx < 0; uzvwkntx++) {String gbrjorbw = "tsjvmfnm";}
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        bugDemo.showBug();
    }
}