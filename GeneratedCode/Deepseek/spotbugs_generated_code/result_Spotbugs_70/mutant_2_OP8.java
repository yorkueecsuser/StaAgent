class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        Integer c = a;  // Mutation: Renaming 'a' to 'c'
        return c == b;
    }
}