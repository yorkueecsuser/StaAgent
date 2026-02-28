class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    private boolean isLoopConditionTrue() {
        return false; // This method always returns false to make the loop unreachable
    }

    private void generateUnreachableLoop() {
        for (int i = 0; isLoopConditionTrue(); i++) {
            // This loop is unreachable because the loop condition is always false
            System.out.println("This line should never be executed");
        }
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
        generateUnreachableLoop(); // Call the method with the unreachable loop
    }
}