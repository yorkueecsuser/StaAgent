class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

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
        boolean condition = getCondition();
        if (!condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code in switch statement");
                    break;
            }
        }
    }

    // Dummy methods to avoid compile-time errors
    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}