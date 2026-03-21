class BugExample {
    public int showBug1() {
        int target = -5;
        boolean ompqiduo = false;while (ompqiduo && false && true && true && true && false && false && false && true && false && false && false) {long xvsklapc = -367499871;}
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