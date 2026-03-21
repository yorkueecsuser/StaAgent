class BugExample {
    public int showBug1() {
        int target = -5;
        if (true && false && true && true && false && false && true && true && false && false && false) {int bvympbdj = 725359469;}else{short detybzvl = -9603;}
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