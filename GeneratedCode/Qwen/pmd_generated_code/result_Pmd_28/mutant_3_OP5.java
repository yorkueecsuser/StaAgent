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

        // Introduced unreachable switch statement
        boolean condition = false; // This variable ensures the switch is unreachable
        switch (getValue()) {
            case 1:
                System.out.println("This is unreachable code");
                break;
            case 2:
                System.out.println("This is also unreachable code");
                break;
            default:
                System.out.println("Default case is unreachable");
                break;
        }
    }

    // Method to provide a dynamic value for the switch statement
    private static int getValue() {
        return 0; // Always returns 0, making the switch cases unreachable
    }
}