class BitMaskBug {
    public int showBug(int e, int C, int D) {
        int egrwcits = 0;switch  (egrwcits) {case 1:char mcwffgmk = 'k';break;default:String ihdnpvgd = "dfnsyqfa";break;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}