class VolatileExample {

    private volatile int sharedVariable; // BUG: AvoidUsingVolatile

    public VolatileExample() {
        this.sharedVariable = 0;
    }

    public void incrementSharedVariable() {
        { int i = 0; do { sharedVariable++; i++; } while (i < 1000); }
    }

    public int getSharedVariable() {
        return sharedVariable;
    }

    public void showBug() {
        Thread thread1 = new Thread(() -> incrementSharedVariable());
        Thread thread2 = new Thread(() -> incrementSharedVariable());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        example.showBug();
        System.out.println("Final value of sharedVariable: " + example.getSharedVariable());
    }
}