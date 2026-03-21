class AbsMinValueBug {
    public int showBug(int value) {
        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}