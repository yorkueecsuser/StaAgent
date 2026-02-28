class ObjectComparisonExample {

    private static final String SENTINEL = "CONSTANT";

    public boolean compareStringsSentinel(String input) {
        // This comparison is valid as it compares with a constant
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            System.out.println("This is unreachable code in compareStringsSentinel");
        } else {
            return input == SENTINEL;
        }
        return false; // Placeholder return to satisfy method structure
    }

    public boolean compareStrings(String a, String b) {
        // BUG: CompareObjectsWithEquals
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            System.out.println("This is unreachable code in compareStrings");
        } else {
            return a == b; // This should use a.equals(b) to compare strings by value
        }
        return false; // Placeholder return to satisfy method structure
    }

    public boolean compareIntegers(Integer a, Integer b) {
        // BUG: CompareObjectsWithEquals
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            System.out.println("This is unreachable code in compareIntegers");
        } else {
            return a == b; // This should use a.equals(b) to compare Integer objects by value
        }
        return false; // Placeholder return to satisfy method structure
    }

    public boolean showBug(String str1, String str2, Integer int1, Integer int2) {
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            System.out.println("This is unreachable code in showBug");
        } else {
            return compareStrings(str1, str2) || compareIntegers(int1, int2);
        }
        return false; // Placeholder return to satisfy method structure
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ObjectComparisonExample example = new ObjectComparisonExample();
        System.out.println(example.showBug("hello", "hello", 128, 128));
        System.out.println(example.showBug("world", "earth", new Integer(1000), new Integer(1000)));
    }
}