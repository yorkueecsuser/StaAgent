class ImmutableBug {
    private final List<String> mutableField; // BUG: Immutable

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void showBug() {
        boolean alwaysFalse = false;
        for(int i = 0; alwaysFalse; i++) { // Unreachable for loop as 'alwaysFalse' is always false
            System.out.println("This line is unreachable");
        }
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    }
}