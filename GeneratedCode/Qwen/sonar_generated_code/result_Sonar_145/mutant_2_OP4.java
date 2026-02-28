class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            arrayToString = "This will never be executed";
            arrayHashCode = -1;
        } else {
            // This block will always execute
            arrayToString = "Original toString: " + arrayToString;
            arrayHashCode = arrayHashCode * 2;
        }

        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}