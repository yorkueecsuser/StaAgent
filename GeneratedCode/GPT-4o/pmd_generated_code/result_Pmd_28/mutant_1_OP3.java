class ObjectComparisonExample {

    private static final String SENTINEL = "CONSTANT";

    public boolean compareStringsSentinel(String input) {
        // This comparison is valid as it compares with a constant
        return input == SENTINEL;
    }

    public boolean compareStrings(String a, String b) {
        // BUG: CompareObjectsWithEquals
        return a == b; // This should use a.equals(b) to compare strings by value
    }

    public boolean compareIntegers(Integer a, Integer b) {
        // BUG: CompareObjectsWithEquals
        return a == b; // This should use a.equals(b) to compare Integer objects by value
    }

    public boolean showBug(String str1, String str2, Integer int1, Integer int2) {
        // Adding an unreachable if statement
        boolean condition = alwaysFalse();
        if (condition) {
            // Unreachable block
            System.out.println("This is unreachable code.");
        }
        
        return compareStrings(str1, str2) || compareIntegers(int1, int2);
    }

    // Method used to ensure the condition is always false at runtime
    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        ObjectComparisonExample example = new ObjectComparisonExample();
        System.out.println(example.showBug("hello", "hello", 128, 128));
        System.out.println(example.showBug("world", "earth", new Integer(1000), new Integer(1000)));
    }
}