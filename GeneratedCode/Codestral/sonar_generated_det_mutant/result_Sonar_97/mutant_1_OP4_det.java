class AbsMinValueBug {
    public int showBug(int value) {
if (false && false && true && false && false && false && true && true && true && true && false) {short findtjso = -1378;}else{boolean veswylsy = true;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}