class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Original code with bug
        // return a == b;

        // Mutated code with bug
        return a.equals(b);
    }
}