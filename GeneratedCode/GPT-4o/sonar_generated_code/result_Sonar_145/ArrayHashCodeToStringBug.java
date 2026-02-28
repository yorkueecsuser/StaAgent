class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Unreachable while loop using a non-final variable as condition
        boolean conditionWhile = isConditionFalse();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    // Method to ensure condition is always false
    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}