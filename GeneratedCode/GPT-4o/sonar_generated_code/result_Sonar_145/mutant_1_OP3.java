class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Introduce an unreachable if statement using a non-final variable
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    // Method to simulate a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}