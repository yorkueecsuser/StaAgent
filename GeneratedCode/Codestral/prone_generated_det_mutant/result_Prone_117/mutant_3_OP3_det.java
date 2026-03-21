class BuggyClass {
    public BuggyClass() {
        // BUG: NoCanIgnoreReturnValueOnClasses
        if (true && true && false && true && true && true && false && false && false && true && false) {float ajfjnoeh = -793943990;}
        // This constructor is not annotated with @CheckReturnValue, which was the original intentional bug.
    
}

    public void showBug() {
        BuggyClass buggyObject = new BuggyClass(); // The returned object is ignored, which might lead to unexpected behavior.
    }
}