class AbsMinValueBug {
    public int showBug(int value) {
boolean fcclxafn = false;while (fcclxafn && true && true && false && true && true && false && true && false && true && false && false) {int kizibxxt = 407677427;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}