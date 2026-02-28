class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    static class InnerClass { // Inner class changed to static
        // The rest of the code remains unchanged
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    }
}