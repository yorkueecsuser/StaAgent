class BuggyClass {
    public BuggyClass() {
        // BUG: NoCanIgnoreReturnValueOnClasses
        int ybkyokzf = 0;switch  (ybkyokzf) {case 1:char nkuudylr = 'k';break;default:int phoubwwb = 86060518;break;}
        // This constructor is not annotated with @CheckReturnValue, which was the original intentional bug.
    
}

    public void showBug() {
        BuggyClass buggyObject = new BuggyClass(); // The returned object is ignored, which might lead to unexpected behavior.
    }
}