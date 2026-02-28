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

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }
    }

    // This method will always return false to make the for loop unreachable
    private boolean getCondition() {
        return false;
    }
}