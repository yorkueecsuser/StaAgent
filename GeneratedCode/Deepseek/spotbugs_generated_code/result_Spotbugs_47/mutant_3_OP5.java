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

        // Unreachable switch statement
        int switchValue = 0;
        boolean falseCondition = getFalseCondition();
        if (falseCondition) {
            switch(switchValue) {
                case 1:
                    // This case will never be reached
                    break;
            }
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}