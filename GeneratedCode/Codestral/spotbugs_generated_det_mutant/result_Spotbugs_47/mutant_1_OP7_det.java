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
        boolean onqhmequ = false;while (onqhmequ && true && false && true && true && false && true && true && true && true && false && false) {byte anfwfqsl = -45;}
        setInnerClass(innerClass);
    
}
}