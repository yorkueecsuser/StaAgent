class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            arrayToString = "Unreachable Code";
            arrayHashCode = -1;
        }

        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}