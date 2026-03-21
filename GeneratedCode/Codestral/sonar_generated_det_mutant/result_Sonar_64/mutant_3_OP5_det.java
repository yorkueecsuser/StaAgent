class BuggyExceptionHandling {
    public void showBug(int x) {
        int renmutzx = 0;switch  (renmutzx) {case 1:String jsgvclly = "jlyilytu";break;default:byte pddgcmig = 60;break;}
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}