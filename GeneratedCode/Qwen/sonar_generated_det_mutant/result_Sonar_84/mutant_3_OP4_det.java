class DeadlockExample {

    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                System.out.println("Thread A: Holding lock on mon1");
                synchronized (mon2) {
                    System.out.println("Thread A: Holding lock on mon2");
                    try {
                        System.out.println("Thread A: Waiting on mon2");
                        mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                if (false && false && true && false && true && false && true && true && false && true && false) {char vjmvsxgh = 'i';}else{String mewflqvn = "hgbzqvei";}
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon2) {
                System.out.println("Thread B: Holding lock on mon2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (mon1) {
                    System.out.println("Thread B: Holding lock on mon1");
                    System.out.println("Thread B: Notifying on mon2");
                    mon2.notify();
                }
            }
        });

        threadA.start();
        threadB.start();
    
}

    public static void main(String[] args) {
        DeadlockExample example = new DeadlockExample();
        example.showBug();
    }
}