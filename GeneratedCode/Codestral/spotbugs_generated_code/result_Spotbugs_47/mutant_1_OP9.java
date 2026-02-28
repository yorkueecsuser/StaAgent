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
        setInnerClass(innerClass);

        // Introduce a new bug by continuously setting and getting the inner class instance from the ThreadLocal
        do {
            InnerClass temp = threadLocal.get();
            setInnerClass(new InnerClass());
        } while (true);
    }
}