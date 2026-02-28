class OuterClass {
    private ThreadLocal<SubClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class SubClass {        // Rename InnerClass to SubClass
        // Inner class that retains reference to the outer class
    }

    public void setSubClass(SubClass subClass) {
        threadLocal.set(subClass);
    }

    public void showBug() {
        SubClass subClass = new SubClass();
        setSubClass(subClass);
    }
}