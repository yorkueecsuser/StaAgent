class SelfComparisonBug {
    private int value;
    private int renamedValue; // Mutant code: renamed variable

    public void setValue(int value) {
        this.value = value;
        this.renamedValue = value; // Mutant code: added assignment
    }

    public boolean showBug() {
        return value == renamedValue; // Mutant code: renamed variable in comparison
    }
}