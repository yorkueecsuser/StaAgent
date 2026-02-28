class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Introducing an unreachable if statement using a non-final variable for the condition
        boolean isUnreachable = calculateCondition(); // This will always return false
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    // Method that always returns false to ensure the if condition is never true
    private boolean calculateCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}