class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    // Mutant code begins
    public String showBugMutant(int[] numbers) {
        // Renamed variable 'hashCode' to 'a'
        int a = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Renamed variable 'toString' to 'b'
        String b = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        return "HashCode: " + a + ", ToString: " + b;
    }
    // Mutant code ends

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));

        // Testing the mutant code
        System.out.println(bugDemo.showBugMutant(sampleArray));
    }
}