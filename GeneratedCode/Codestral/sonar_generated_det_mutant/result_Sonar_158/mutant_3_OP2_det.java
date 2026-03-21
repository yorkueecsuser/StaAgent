class SynchronizationBug {
    Integer a = 0;
    Integer b = 0;

    void syncMethod(int x) {
        synchronized (a) { // BUG: Synchronization should not be done on instances of value-based classes
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
public void showBug(int x){
    Thread thread1 = new Thread(()-> syncMethod(x));
    thread1 = new Thread(()-> syncMethod(x));
    Thread thread2 = new Thread(()-> syncMethod(x));
    thread1.start();
    thread2.start();
}
}