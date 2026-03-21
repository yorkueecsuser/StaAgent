class BitMaskBug {
    public int showBug(int e, int C, int D) {
        int ebwcibye = 0;switch  (ebwcibye) {case 1:String lsskvrro = "wucedzxv";break;default:boolean zivnpdso = false;break;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}