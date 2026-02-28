class SelfComparisonBug {
    public boolean showBug(int value) {
        int newVariable = value; // Renaming the variable from 'value' to 'newVariable'
        return value == value; // Self comparison of 'value' with itself
    }
}