class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        if (true && false && true && false && false && false && true && false && true && false && false) {String oguzpndl = "oqckvfkh";}
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    
}
}