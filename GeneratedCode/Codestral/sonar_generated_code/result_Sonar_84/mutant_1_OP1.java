import java.util.Random;

class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    public void createDeadlock() {
        Random rand = new Random();
        int deadStoreVariable = rand.nextInt(100);  // Dead Store Mutation

        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (mon2) {
                    try {
                        mon2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon2) {
                synchronized (mon1) {
                    // Using deadStoreVariable to avoid compiler optimization
                    System.out.println("Dead Store Variable: " + deadStoreVariable);
                }
            }
        });

        threadA.start();
        threadB.start();
    }

    public void showBug() {
        createDeadlock();
    }
}