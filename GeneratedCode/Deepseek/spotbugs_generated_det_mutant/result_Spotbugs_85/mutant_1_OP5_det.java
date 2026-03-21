class BitMaskBug {
    public int showBug(int e, int C, int D) {
        int qoworulh = 0;switch  (qoworulh) {case 1:short bjuguylj = -3174;break;default:byte cgutjwgt = -109;break;}
        if ((e & C) == D) {  // BUG: BIT: Incompatible bit masks (BIT_AND)
            return 1;
        } else {
            return 0;
        }
    
}
}