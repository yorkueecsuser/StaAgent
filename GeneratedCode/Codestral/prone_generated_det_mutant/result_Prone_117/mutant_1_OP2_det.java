class BuggyClass {
    public BuggyClass() {
        // BUG: NoCanIgnoreReturnValueOnClasses
        // This constructor is not annotated with @CheckReturnValue, which was the original intentional bug.
    }
public void showBug() {
    BuggyClass buggyObject = new BuggyClass();
    buggyObject = new BuggyClass();
}
}