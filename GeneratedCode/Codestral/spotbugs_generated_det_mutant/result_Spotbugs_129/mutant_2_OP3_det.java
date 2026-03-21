class ShiftBug {
    public int showBug(int x, int y) {
if (false && true && true && true && false && false && true && false && false && false && false) {char dtzbkfbb = 'b';}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}