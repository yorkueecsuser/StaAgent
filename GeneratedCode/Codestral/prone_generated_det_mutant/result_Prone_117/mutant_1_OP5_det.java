class BuggyClass {
    public BuggyClass() {
        // BUG: NoCanIgnoreReturnValueOnClasses
        int hhludnmj = 0;switch  (hhludnmj) {case 1:String ydwfwzkd = "zatiwyev";break;default:float cddxiwdy = -892017970;break;}
        // This constructor is not annotated with @CheckReturnValue, which was the original intentional bug.
    
}

    public void showBug() {
        BuggyClass buggyObject = new BuggyClass(); // The returned object is ignored, which might lead to unexpected behavior.
    }
}