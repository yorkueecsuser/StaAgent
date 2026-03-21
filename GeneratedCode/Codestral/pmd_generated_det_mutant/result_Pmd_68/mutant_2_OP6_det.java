class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        for  (int nnjqqjee = 0; nnjqqjee < 0; nnjqqjee++) {boolean srxlgyop = true;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}