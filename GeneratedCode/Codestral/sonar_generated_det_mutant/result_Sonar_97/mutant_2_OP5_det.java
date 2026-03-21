class AbsMinValueBug {
    public int showBug(int value) {
int lfodpnvx = 0;switch  (lfodpnvx) {case 1:String kgjpcmfv = "snuudqxy";break;default:float hpixestr = -625231844;break;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}