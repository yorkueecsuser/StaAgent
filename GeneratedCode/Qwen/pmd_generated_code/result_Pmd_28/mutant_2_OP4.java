class CompareObjectsWithEqualsExample {

    // Constant field example
    public static final CompareObjectsWithEqualsExample SENTINEL = new CompareObjectsWithEqualsExample();

    private String name;

    public CompareObjectsWithEqualsExample() {
        this.name = "default";
    }

    public CompareObjectsWithEqualsExample(String name) {
        this.name = name;
    }

    public boolean compareUsingEquals(CompareObjectsWithEqualsExample other) {
        return this.equals(other);
    }

    public boolean compareUsingDoubleEquals(CompareObjectsWithEqualsExample other) {
        return this == other; // BUG: CompareObjectsWithEquals
    }

    public boolean compareConstantUsingDoubleEquals(CompareObjectsWithEqualsExample other) {
        return other == SENTINEL; // This is allowed because SENTINEL is a constant
    }

    public boolean showBug(CompareObjectsWithEqualsExample obj1, CompareObjectsWithEqualsExample obj2) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable else branch");
        }
        return obj1 == obj2; // BUG: CompareObjectsWithEquals
    }

    public static void main(String[] args) {
        CompareObjectsWithEqualsExample example1 = new CompareObjectsWithEqualsExample("example");
        CompareObjectsWithEqualsExample example2 = new CompareObjectsWithEqualsExample("example");

        System.out.println(example1.showBug(example1, example2)); // This will print false due to the bug
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will ensure the else branch is unreachable
    }
}