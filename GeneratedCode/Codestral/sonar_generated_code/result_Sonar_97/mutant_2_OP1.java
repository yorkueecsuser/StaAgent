class AbsBug {
    public int showBug(String str) {
        String deadstore = "unused_var"; // dead store
        return Math.abs(str.hashCode());
    }
}