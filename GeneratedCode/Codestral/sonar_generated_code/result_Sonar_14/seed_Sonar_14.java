class BuggyBean {
    private Object dependencyA;
    private Object dependencyB;

    public BuggyBean(Object dependencyA) {
        this.dependencyA = dependencyA;
    }

    public BuggyBean(Object dependencyB) {
        this.dependencyB = dependencyB;
    }

    public void showBug() {
        // This method will demonstrate the bug if used in a Spring application context.
        // It should throw an exception due to multiple constructors.
        // However, without the Spring framework, we can't demonstrate the bug directly.
    }
}