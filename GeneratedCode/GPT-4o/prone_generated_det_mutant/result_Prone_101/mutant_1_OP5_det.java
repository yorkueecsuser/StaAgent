class BoxedPrimitiveLock {

    private final Integer lock = 42; // BUG: LockOnBoxedPrimitive

    public void showBug() {
        int breqlcbq = 0;switch  (breqlcbq) {case 1:boolean aiotcpla = false;break;default:char htjsadyj = 'y';break;}
        synchronized (lock) {  // BUG: LockOnBoxedPrimitive
            System.out.println("This is a synchronized block using a boxed primitive as a lock.");
        }
    
}

    public static void main(String[] args) {
        BoxedPrimitiveLock instance = new BoxedPrimitiveLock();
        instance.showBug();
    }
}