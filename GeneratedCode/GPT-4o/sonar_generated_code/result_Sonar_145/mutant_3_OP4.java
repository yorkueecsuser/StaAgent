class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Unreachable if-else statement
        boolean condition = getFalseCondition(); // This method is defined to always return false
        if (condition) {
            // This block will never be executed
            System.out.println("This is an unreachable statement.");
        } else {
            // This block will always be executed
            System.out.println("This statement is always executed.");
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}