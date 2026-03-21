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
        boolean srrqcxtx = false;while (srrqcxtx && false && true && false && false && true && false && true && false && false && true && false) {String gzopddim = "eszzkwyf";}
        setInnerClass(innerClass);
    
}
}