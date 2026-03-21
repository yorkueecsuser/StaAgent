class ShiftBug {
    public int showBug(int x, int y) {
if (true && true && false && false && true && true && false && false && false && false && false) {long asejgpex = -470090938;}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}