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

        // Mutated code: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // This block of code will never be executed
            System.out.println("This line should never be printed.");
        } else {
            // This block of code is always executed
            System.out.println("This line should always be printed.");
        }
    }
}