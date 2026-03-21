class ShiftBug {
    public int showBug(int x, int y) {
int kvoswdcq = 0;switch  (kvoswdcq) {case 1:boolean ddzlfbbp = false;break;default:int aediefzx = 808727213;break;}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}