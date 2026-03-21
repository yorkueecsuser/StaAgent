class SelfComparisonBug {
    public boolean showBug(int value) {
        int duplicateValue = value; // Mutant code: duplicating the assignment statement
        return value == duplicateValue; // Self comparison of value with duplicateValue
    }
}