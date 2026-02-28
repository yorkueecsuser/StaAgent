class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            arrayToString = "Unreachable Block";
            arrayHashCode = -1;
        } else {
            // This block will always execute
            arrayToString = java.util.Arrays.toString(array);
            arrayHashCode = java.util.Arrays.hashCode(array);
        }

        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}