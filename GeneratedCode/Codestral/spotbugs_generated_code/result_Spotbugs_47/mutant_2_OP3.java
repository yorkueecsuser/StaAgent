class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>();

    class InnerClass {
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        }

        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    }
}