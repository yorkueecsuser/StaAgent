class AbsMinValueBug {
    public int showBug(int value) {
boolean plgwohsk = false;while (plgwohsk && true && false && true && true && false && true && true && true && false && false && false) {float nwzjonfb = -692577582;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}