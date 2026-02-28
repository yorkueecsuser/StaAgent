class AbsBug {
    public int showBug(String s) {
        return Math.abs(s.hashCode());
    }
    // Mutant code
    public int showMutant(String str) {
        return Math.abs(str.hashCode());
    }
}