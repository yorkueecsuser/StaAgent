class ShiftBug {
    public int showBug(int x, int y) {
int zhvqlifd = 0;switch  (zhvqlifd) {case 1:char tocwpeln = 'n';break;default:boolean upazgofy = true;break;}

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}