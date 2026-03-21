class AbsMinValueBug {
    public int showBug(int value) {
char batepdrr = 'v';

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}