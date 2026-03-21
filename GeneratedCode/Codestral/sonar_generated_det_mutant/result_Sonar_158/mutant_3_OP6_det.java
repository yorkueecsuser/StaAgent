class SynchronizationBug {
    Integer a = 0;
    Integer b = 0;

    void syncMethod(int x) {
        synchronized (a) { // BUG: Synchronization should not be done on instances of value-based classes
            for  (int yrbxdykt = 0; yrbxdykt < 0; yrbxdykt++) {long jaywzxck = 756491036;}
            if (a == x) {
                //... do something here
            }
        }
        synchronized (b) { // BUG: Synchronization should not be done on instances of value-based classes
            if (b == x) {
                //... do something else
            }
        }
    
}

    public void showBug(int x) {
        // Create multiple threads that will try to synchronize on the same value-based class instances
        Thread thread1 = new Thread(() -> syncMethod(x));
        Thread thread2 = new Thread(() -> syncMethod(x));

        thread1.start();
        thread2.start();

        // This might lead to unrelated threads deadlocking with unclear stacktraces
    }
}