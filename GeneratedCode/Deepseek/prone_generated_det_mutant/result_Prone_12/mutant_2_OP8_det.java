class BugExample {
    public int showBug() {
        int ngcobccj = 10;  // Number to be shifted
        int ftwynbnx = 32;  // Shift amount that is out of range
        int jcjvpoos = ngcobccj << ftwynbnx;  // BUG: BadShiftAmount
        return jcjvpoos;
    }
}