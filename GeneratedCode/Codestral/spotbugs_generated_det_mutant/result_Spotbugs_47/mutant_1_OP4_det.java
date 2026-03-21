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
        if (false && false && true && true && true && false && false && false && false && false && false) {int lyvwlreh = -916577810;}else{byte aadzxjiu = 122;}
        setInnerClass(innerClass);
    
}
}