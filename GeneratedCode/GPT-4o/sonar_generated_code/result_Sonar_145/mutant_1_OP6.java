class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition(); // Use a method to get condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    // Method to provide condition, simulating a dynamic runtime condition
    private boolean getCondition() {
        return false; // Always returns false, making the for loop unreachable
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}