class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Dead Store Mutation: Inserting an unused variable with a primitive type
        int wxyzabcd = 12345678; // This is a unique dead store added as per the mutation operator requirements

        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}