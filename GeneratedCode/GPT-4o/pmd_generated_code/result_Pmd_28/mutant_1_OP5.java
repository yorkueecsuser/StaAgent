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
        // Inserting the unreachable switch statement as a mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case is designed to be unreachable
                System.out.println("This code is unreachable.");
                break;
            default:
                // Do nothing
                break;
        }

        return compareStrings(str1, str2) || compareIntegers(int1, int2);
    }

    private int getUnreachableValue() {
        // Always returns a value that won't match the unreachable case
        return -1;
    }

    public static void main(String[] args) {
        ObjectComparisonExample example = new ObjectComparisonExample();
        System.out.println(example.showBug("hello", "hello", 128, 128));
        System.out.println(example.showBug("world", "earth", new Integer(1000), new Integer(1000)));
    }
}