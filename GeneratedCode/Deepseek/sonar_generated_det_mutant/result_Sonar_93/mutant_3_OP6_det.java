class BugExample {
    public int showBug1() {
        int target = -5;
        for  (int vvrexlxj = 0; vvrexlxj < 0; vvrexlxj++) {char fixdbybq = 'b';}
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