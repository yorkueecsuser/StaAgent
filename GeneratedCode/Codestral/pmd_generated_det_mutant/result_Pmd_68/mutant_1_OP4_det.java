class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        if (true && false && true && false && false && true && false && false && true && true && false) {float gttseubq = -405937087;}else{int wxpjwkkl = 75490656;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}