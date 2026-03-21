class BuggyExceptionHandling {
    public void showBug(int x) {
        int bdojcadt = 0;switch  (bdojcadt) {case 1:String qrkoxcju = "xbfhrfvc";break;default:short qeggysfx = 7132;break;}
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}