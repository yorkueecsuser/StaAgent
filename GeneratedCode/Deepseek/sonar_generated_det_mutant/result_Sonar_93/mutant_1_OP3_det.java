class BugExample {
    public int showBug1() {
        int target = -5;
        if (false && false && false && false && true && true && true && false && false && false && false) {int pwfaqhgi = -234318079;}
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