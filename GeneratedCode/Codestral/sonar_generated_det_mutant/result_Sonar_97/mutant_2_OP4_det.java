class AbsMinValueBug {
    public int showBug(int value) {
if (true && true && false && true && true && true && false && false && true && false && false) {String xpboezky = "pxcawsei";}else{boolean qpmsdosp = false;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}