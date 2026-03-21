class BuggyClass {
    public BuggyClass() {
        // BUG: NoCanIgnoreReturnValueOnClasses
        if (false && false && false && false && true && true && true && false && false && true && false) {boolean ivajjonp = true;}else{int exkuogpm = 241505728;}
        // This constructor is not annotated with @CheckReturnValue, which was the original intentional bug.
    
}

    public void showBug() {
        BuggyClass buggyObject = new BuggyClass(); // The returned object is ignored, which might lead to unexpected behavior.
    }
}