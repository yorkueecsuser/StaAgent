class AbsMinValueBug {
    public int showBug(int value) {
for  (int gsxkqnzj = 0; gsxkqnzj < 0; gsxkqnzj++) {long zszkstfs = -775915831;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}