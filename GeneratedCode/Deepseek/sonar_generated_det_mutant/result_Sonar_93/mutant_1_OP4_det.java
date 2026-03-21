class BugExample {
    public int showBug1() {
        int target = -5;
        if (true && false && false && true && false && false && false && false && true && true && false) {int usmbgnrs = -598823467;}else{int feyclntg = 236740208;}
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