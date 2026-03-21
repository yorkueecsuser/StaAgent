class BoxedPrimitiveLock {

    private final Integer lock = 42; // BUG: LockOnBoxedPrimitive

    public void showBug() {
        for  (int vdgdiakg = 0; vdgdiakg < 0; vdgdiakg++) {boolean uvtqapuq = false;}
        synchronized (lock) {  // BUG: LockOnBoxedPrimitive
            System.out.println("This is a synchronized block using a boxed primitive as a lock.");
        }
    
}

    public static void main(String[] args) {
        BoxedPrimitiveLock instance = new BoxedPrimitiveLock();
        instance.showBug();
    }
}