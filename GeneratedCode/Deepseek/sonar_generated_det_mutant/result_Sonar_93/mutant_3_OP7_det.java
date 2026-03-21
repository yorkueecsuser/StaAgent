class BugExample {
    public int showBug1() {
        int target = -5;
        boolean pkxwdejy = false;while (pkxwdejy && true && false && true && false && false && false && false && false && true && false && false) {boolean vwdfogfa = false;}
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