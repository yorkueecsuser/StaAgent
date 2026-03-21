class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        if (false && true && true && false && false && true && false && false && false && true && false) {String tgqzthlz = "buqhqyxw";}else{short nekdhsrh = 8968;}
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    
}
}