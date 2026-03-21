class AbsMinValueBug {
    public int showBug(int value) {
if (false && false && false && false && false && false && false && true && false && false && false) {long xkoofckf = 302069267;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}