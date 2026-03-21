class ShiftBug {
    public int showBug(int x, int y) {
int flpkdfaj = 0;switch  (flpkdfaj) {case 1:String hzhscqet = "jzmtyzwb";break;default:String mdexunpm = "blgbmhgu";break;}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}