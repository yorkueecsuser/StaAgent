class AbsBug {
    public int showBug(String str) {
        int h = str.hashCode(); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        if (h!= Integer.MIN_VALUE) {
            h = Math.abs(h);
        }
        return h;
    }

    // Mutant: Renaming 'h' to 'i'
    public int showBugMutant(String str) {
        int i = str.hashCode();
        if (i!= Integer.MIN_VALUE) {
            i = Math.abs(i);
        }
        return i;
    }
}