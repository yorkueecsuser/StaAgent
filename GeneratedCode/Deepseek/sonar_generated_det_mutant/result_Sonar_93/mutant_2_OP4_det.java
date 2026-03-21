class BugExample {
    public int showBug1() {
        int target = -5;
        if (false && false && true && false && true && false && false && true && false && true && false) {long rpwcskeq = 922844844;}else{char uetoodjs = 'u';}
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