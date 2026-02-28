class AbsBug {
    public int showBug(String str) {
        int deadStore = 0;  // Inserting a dead store variable
        return Math.abs(str.hashCode()); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}