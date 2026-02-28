class SelfComparisonBug {
    public boolean showBug(int value) {
        int renamedValue = value; // New variable to rename
        return value == renamedValue; // Self comparison of value with itself
    }
}