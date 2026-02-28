class SynchronizationBug {

    // Bug: Synchronization should not be done on instances of value-based classes
    Integer a = 0;
    Integer b = 0;

    void syncMethod(int x) {
        // Bug is here - using 'a' for synchronization
        synchronized (a) {
            if (a == x) {
                //... do something here
            }
        }
        // Bug is here - using 'b' for synchronization
        synchronized (b) {
            if (b == x) {
                //... do something else
            }
        }
    }

    public void showBug(int x) {
        Thread thread1 = new Thread(() -> syncMethod(x));
        Thread thread2 = new Thread(() -> syncMethod(x));

        thread1.start();
        thread2.start();

        // We are not handling the results here as it's not the focus of the bug demonstration
    }
}