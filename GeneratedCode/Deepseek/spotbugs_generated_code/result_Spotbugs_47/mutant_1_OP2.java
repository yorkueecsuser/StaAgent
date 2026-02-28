class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
        threadLocal.set(innerClass); // Duplicated assignment statement
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    }
}