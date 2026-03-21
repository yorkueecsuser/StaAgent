class AbsMinValueBug {
    public int showBug(int value) {
for  (int rcgvachv = 0; rcgvachv < 0; rcgvachv++) {short vfnsaqvx = -7538;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}