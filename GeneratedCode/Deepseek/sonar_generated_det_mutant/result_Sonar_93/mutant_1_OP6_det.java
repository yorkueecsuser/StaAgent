class BugExample {
    public int showBug1() {
        int target = -5;
        for  (int mpgpgrjm = 0; mpgpgrjm < 0; mpgpgrjm++) {short drzavtwl = -4230;}
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