class BuggyClass {
    public BuggyClass() {
        // BUG: NoCanIgnoreReturnValueOnClasses
        if (true && false && true && true && false && true && false && true && false && false && false) {int bcvrcqqa = -438350636;}
        // This constructor is not annotated with @CheckReturnValue, which was the original intentional bug.
    
}

    public void showBug() {
        BuggyClass buggyObject = new BuggyClass(); // The returned object is ignored, which might lead to unexpected behavior.
    }
}