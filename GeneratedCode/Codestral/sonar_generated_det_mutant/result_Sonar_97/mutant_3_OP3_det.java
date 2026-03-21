class AbsMinValueBug {
    public int showBug(int value) {
if (false && true && false && false && true && true && true && false && true && false && false) {short qadxgrbu = 5252;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}