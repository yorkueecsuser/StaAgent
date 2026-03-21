class BugExample {
    public int showBug1() {
        int target = -5;
        if (true && false && false && true && true && false && true && false && true && true && false) {double pzqjkzmt = 943545208;}
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        return target;
    
}
    
    public int showBug2() {
        int target = -5;
        int num = 3;

        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }
}