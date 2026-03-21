class BugExample {
    public int showBug1() {
        int xbgszftc = -5;
        int fdajhxff = 3;

        xbgszftc =- fdajhxff;  // BUG: Non-existent operators like "=+" should not be used
        return xbgszftc;
    }
    
    public int showBug2() {
        int target = -5;
        int num = 3;

        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }
}