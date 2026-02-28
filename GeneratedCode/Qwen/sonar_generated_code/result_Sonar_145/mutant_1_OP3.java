class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances

        // Introduced unreachable if statement using a non-final variable
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            arrayToString = "This is unreachable";
            arrayHashCode = 0;
        }

        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;
    }

    private boolean getCondition() {
        // Always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}