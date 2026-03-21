class BugExample {
    public int showBug1() {
        int peyitehw = -5;
        int afozpnci = 3;

        peyitehw =- afozpnci;  // BUG: Non-existent operators like "=+" should not be used
        return peyitehw;
    }
    
    public int showBug2() {
        int target = -5;
        int num = 3;

        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }
}