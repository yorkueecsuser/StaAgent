class BoxedPrimitiveLock {

    private final Integer lock = 42; // BUG: LockOnBoxedPrimitive

    public void showBug() {
        int vjejomji = 0;switch  (vjejomji) {case 1:int jppgffin = -631523142;break;default:double asihttno = 179800445;break;}
        synchronized (lock) {  // BUG: LockOnBoxedPrimitive
            System.out.println("This is a synchronized block using a boxed primitive as a lock.");
        }
    
}

    public static void main(String[] args) {
        BoxedPrimitiveLock instance = new BoxedPrimitiveLock();
        instance.showBug();
    }
}