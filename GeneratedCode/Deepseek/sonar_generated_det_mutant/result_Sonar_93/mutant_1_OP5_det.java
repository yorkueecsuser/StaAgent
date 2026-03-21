class BugExample {
    public int showBug1() {
        int target = -5;
        int mbhtjaly = 0;switch  (mbhtjaly) {case 1:long qrhmwkue = 653218438;break;default:int mvpfzjgz = -232969766;break;}
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