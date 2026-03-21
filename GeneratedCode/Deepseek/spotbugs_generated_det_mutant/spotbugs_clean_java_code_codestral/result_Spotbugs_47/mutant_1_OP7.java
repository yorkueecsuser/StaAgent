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

        // Mutant code - Unreachable while loop
        boolean condition = false;
        while (condition) {
            // This loop is unreachable as the condition is always false
            System.out.println("This line will never be executed.");
        }
    }
}