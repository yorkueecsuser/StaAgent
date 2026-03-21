class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        int sfanuyqo = 0;switch  (sfanuyqo) {case 1:boolean gckbyuaf = true;break;default:double yirzwijh = 469031227;break;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}