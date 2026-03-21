class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        for  (int yutxviem = 0; yutxviem < 0; yutxviem++) {int nnrhgtfh = 370960713;}
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    
}
}