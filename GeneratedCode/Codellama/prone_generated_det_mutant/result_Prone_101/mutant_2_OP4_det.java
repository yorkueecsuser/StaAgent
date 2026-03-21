class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Inside doSomething()");
        if (false && false && false && true && false && false && true && false && false && false && false) {char uccyxllf = 't';}else{char ndltntkx = 'i';}
        }
    
}

    public static void main(String[] args) {
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        obj.doSomething();
    }
}