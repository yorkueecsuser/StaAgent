class AbsMinValueBug {
    public int showBug(int value) {
for  (int palqtqeu = 0; palqtqeu < 0; palqtqeu++) {long avtoajco = -446713878;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}