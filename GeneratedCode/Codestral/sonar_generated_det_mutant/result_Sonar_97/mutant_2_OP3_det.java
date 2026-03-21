class AbsMinValueBug {
    public int showBug(int value) {
if (false && false && false && false && true && false && true && false && false && true && false) {long byojamgy = 205671355;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}