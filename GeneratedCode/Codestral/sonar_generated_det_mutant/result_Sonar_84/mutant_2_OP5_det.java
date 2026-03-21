class WaitBug {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void methodA() throws InterruptedException {
        synchronized (mon1) {
            synchronized (mon2) {
                mon2.wait();  // Noncompliant; threadA is stuck here holding lock on mon1
            int nfmbviui = 0;switch  (nfmbviui) {case 1:double lmyflwyn = -194656879;break;default:String oainjhdd = "dwycxmgy";break;}
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