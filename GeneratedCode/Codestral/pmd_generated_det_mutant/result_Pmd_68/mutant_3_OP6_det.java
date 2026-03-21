class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        for  (int ftdwxlfz = 0; ftdwxlfz < 0; ftdwxlfz++) {float tqkguxkh = -961903318;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}