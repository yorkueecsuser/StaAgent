class AbsMinValueBug {
    public int showBug(int value) {
int itonzdoa = 0;switch  (itonzdoa) {case 1:boolean iqawaqkr = false;break;default:long imensxml = -614368564;break;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}