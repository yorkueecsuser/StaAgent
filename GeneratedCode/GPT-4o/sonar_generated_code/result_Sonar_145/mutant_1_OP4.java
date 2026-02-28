class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        // Mutation: Insert an unreachable if-else branch
        boolean neverTrueCondition = getCondition(); // This condition is always false
        if (neverTrueCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    private boolean getCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}