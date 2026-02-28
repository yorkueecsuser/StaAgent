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

        // Mutation Operator: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable and will never be executed
            // It is added to demonstrate the mutation operator
            System.out.println("Unreachable branch executed.");
        }
    }
}