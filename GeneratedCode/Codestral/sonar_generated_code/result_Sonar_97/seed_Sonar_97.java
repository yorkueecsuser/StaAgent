class AbsBug {
    public int showBug(String str) {
        return Math.abs(str.hashCode()); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}