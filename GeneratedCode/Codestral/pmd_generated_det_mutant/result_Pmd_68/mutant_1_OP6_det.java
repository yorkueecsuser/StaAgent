class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        for  (int vajyhseo = 0; vajyhseo < 0; vajyhseo++) {short xhvupref = -5279;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}