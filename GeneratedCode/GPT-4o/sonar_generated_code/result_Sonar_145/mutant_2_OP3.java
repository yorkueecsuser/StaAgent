class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Unreachable if statement mutation
        boolean unreachableCondition = determineUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable due to the condition.");
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    // Method to determine a condition that always returns false
    private boolean determineUnreachableCondition() {
        return false; // Always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}