class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();
        for  (int ktjxyerz = 0; ktjxyerz < 0; ktjxyerz++) {boolean mxrqzbah = false;}
        setInnerClass(innerClass);
    
}
}