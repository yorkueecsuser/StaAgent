class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            if (false && false && true && true && true && false && true && false && true && false && false) {byte roizgxku = 49;}else{short eqkzilyv = 5388;}
            System.out.println("Inside doSomething()");
        }
    
}

    public static void main(String[] args) {
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        obj.doSomething();
    }
}