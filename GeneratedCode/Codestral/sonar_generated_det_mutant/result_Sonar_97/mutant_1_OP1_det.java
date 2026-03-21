class AbsMinValueBug {
    public int showBug(int value) {
int xsxzrusa = 761392882;

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}