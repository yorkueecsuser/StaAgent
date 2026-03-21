class BoxedPrimitiveLock {

    private final Integer lock = 42; // BUG: LockOnBoxedPrimitive

    public void showBug() {
        int sufydbru = 0;switch  (sufydbru) {case 1:short cfrtdtzc = 3401;break;default:int sxewhnsp = -438662642;break;}
        synchronized (lock) {  // BUG: LockOnBoxedPrimitive
            System.out.println("This is a synchronized block using a boxed primitive as a lock.");
        }
    
}

    public static void main(String[] args) {
        BoxedPrimitiveLock instance = new BoxedPrimitiveLock();
        instance.showBug();
    }
}