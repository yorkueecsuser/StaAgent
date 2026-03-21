class BuggyClass {
    public BuggyClass() {
        // BUG: NoCanIgnoreReturnValueOnClasses
        for  (int jykvluyu = 0; jykvluyu < 0; jykvluyu++) {char gipbeblx = 'w';}
        // This constructor is not annotated with @CheckReturnValue, which was the original intentional bug.
    
}

    public void showBug() {
        BuggyClass buggyObject = new BuggyClass(); // The returned object is ignored, which might lead to unexpected behavior.
    }
}