class BuggyCode {
    public String showBug(int param) {
        String result = "";
        if (param == 1) {
            result = "Open window";
        } else if (param == 2) {
            result = "Close window";
        } else if (param == 1) {  // BUG: Related "if/else if" statements should not have the same condition
            result = "Move window to the background"; // This line of code is dead code as it will never be executed
        }
        return result;
    }
}