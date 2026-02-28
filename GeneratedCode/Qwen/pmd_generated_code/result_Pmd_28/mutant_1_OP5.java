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
        return obj1 == obj2; // BUG: CompareObjectsWithEquals
    }

    public static void main(String[] args) {
        CompareObjectsWithEqualsExample example1 = new CompareObjectsWithEqualsExample("example");
        CompareObjectsWithEqualsExample example2 = new CompareObjectsWithEqualsExample("example");

        System.out.println(example1.showBug(example1, example2)); // This will print false due to the bug

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            case 1:
                // This case is always executed
                System.out.println("This will always be printed");
                break;
        }
    }

    private static boolean getCondition() {
        return false; // This method always returns false, making the switch statement's first case unreachable
    }
}