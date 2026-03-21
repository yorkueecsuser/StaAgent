class BoxedPrimitiveLock {

    private final Integer lock = 42; // BUG: LockOnBoxedPrimitive

    public void showBug() {
        for  (int rzcncyxn = 0; rzcncyxn < 0; rzcncyxn++) {int wudnioel = 68261067;}
        synchronized (lock) {  // BUG: LockOnBoxedPrimitive
            System.out.println("This is a synchronized block using a boxed primitive as a lock.");
        }
    
}

    public static void main(String[] args) {
        BoxedPrimitiveLock instance = new BoxedPrimitiveLock();
        instance.showBug();
    }
}