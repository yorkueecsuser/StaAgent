class ShiftBug {
    public int showBug(int x, int y) {
if (false && false && true && false && false && false && false && false && true && false && false) {boolean htxazxfg = true;}else{String kdmpiezd = "sxfbfjre";}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}