class AbsBug {
    public int showBug(String str) {
        String r = str;
        return Math.abs(r.hashCode()); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}