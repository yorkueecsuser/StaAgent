class WaitBug {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void methodA() throws InterruptedException {
        synchronized (mon1) {
            synchronized (mon2) {
                mon2.wait();  // Noncompliant; threadA is stuck here holding lock on mon1
            if (false && false && true && true && false && true && true && true && true && false && false) {byte emqaefhp = -64;}else{boolean jkrgqavy = true;}
            }
        }
    
}

    public void methodB() throws InterruptedException {
        synchronized (mon2) {
            synchronized (mon1) {
                mon1.notify();
            }
        }
    }

    public void showBug() throws InterruptedException {
        Thread threadA = new Thread(() -> {
            try {
                methodA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread threadB = new Thread(() -> {
            try {
                methodB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
    }
}