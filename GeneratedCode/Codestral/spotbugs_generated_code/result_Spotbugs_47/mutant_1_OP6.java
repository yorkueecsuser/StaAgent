class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    class InnerClass {
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);

        // Unreachable for loop:
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This line will never be printed");
        }
    }
}