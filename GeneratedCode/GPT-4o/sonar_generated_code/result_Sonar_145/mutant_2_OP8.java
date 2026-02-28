class ArrayHashCodeToStringBug {

    public String showBug(int[] numbers) {
        // Directly calling hashCode() on an array instance
        int hashCode = numbers.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        
        // Directly calling toString() on an array instance
        String toString = numbers.toString(); // BUG: "hashCode" and "toString" should not be called on array instances

        return "HashCode: " + hashCode + ", ToString: " + toString;
    }

    public String showBugMutant(int[] numbers) {
        // Directly calling hashCode() on an array instance with a renamed variable
        int a = numbers.hashCode(); // Renamed variable "hashCode" to "a"
        
        // Directly calling toString() on an array instance with a renamed variable
        String b = numbers.toString(); // Renamed variable "toString" to "b"

        return "HashCode: " + a + ", ToString: " + b;
    }

    public static void main(String[] args) {
        ArrayHashCodeToStringBug bugDemo = new ArrayHashCodeToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
        System.out.println(bugDemo.showBugMutant(sampleArray)); // Added call to mutant method
    }
}