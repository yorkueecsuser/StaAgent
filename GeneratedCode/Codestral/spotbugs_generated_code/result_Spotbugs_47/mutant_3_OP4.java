class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // This branch is unreachable due to the always-false condition
            System.out.println("This line should never print.");
        } else {
            // This branch is always executed
            System.out.println("This line should always print.");
        }
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    }
}