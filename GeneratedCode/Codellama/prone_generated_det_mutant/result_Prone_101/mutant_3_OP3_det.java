class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            if (false && false && true && false && false && true && false && false && true && true && false) {int atiqejnq = 639880384;}
            System.out.println("Inside doSomething()");
        }
    
}

    public static void main(String[] args) {
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        obj.doSomething();
    }
}