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
        if (true && false && false && false && false && false && false && true && true && false && false) {short cjlkgwem = 2575;}else{double adhqtart = -748240171;}
        setInnerClass(innerClass);
    
}
}