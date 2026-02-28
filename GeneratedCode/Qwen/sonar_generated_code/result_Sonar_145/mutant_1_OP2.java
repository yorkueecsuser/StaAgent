class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        String arrayToStringCopy = array.toString(); // Mutant: Duplicate of the assignment statement
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCodeCopy = array.hashCode(); // Mutant: Duplicate of the assignment statement
        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}