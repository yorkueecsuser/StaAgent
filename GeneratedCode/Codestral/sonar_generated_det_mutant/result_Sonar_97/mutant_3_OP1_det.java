class AbsMinValueBug {
    public int showBug(int value) {
byte jksnthrt = -103;

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}