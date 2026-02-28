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
    }

    // New method to demonstrate the unreachable switch statement
    public void unreachableSwitchExample() {
        int value = 0; // Always evaluates to a value that doesn't match any case
        switch(value) {
            case 1:
                System.out.println("This code will never be executed");
                break;
            default:
                System.out.println("This is the default case");
        }
    }
}