class ShiftBug {
    public int showBug(int x, int y) {
if (true && true && true && false && false && true && true && true && true && false && false) {byte fxfimwir = 67;}else{boolean nsddqesl = false;}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}