class ShiftBug {
    public int showBug(int x, int y) {
if (false && true && false && false && false && true && true && true && true && true && false) {short zbhnkbiy = -9030;}else{byte xssudvrh = -95;}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}