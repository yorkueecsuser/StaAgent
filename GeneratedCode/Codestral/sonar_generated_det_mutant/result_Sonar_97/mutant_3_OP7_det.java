class AbsMinValueBug {
    public int showBug(int value) {
boolean bbreinkx = false;while (bbreinkx && true && true && true && false && false && false && true && false && false && false && false) {long cegrzezh = 363937252;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}