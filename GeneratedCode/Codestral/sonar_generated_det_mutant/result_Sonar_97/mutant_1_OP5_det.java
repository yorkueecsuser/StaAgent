class AbsMinValueBug {
    public int showBug(int value) {
int jakhterv = 0;switch  (jakhterv) {case 1:boolean bmrwbxvx = true;break;default:long aqkaewnj = -653640884;break;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}