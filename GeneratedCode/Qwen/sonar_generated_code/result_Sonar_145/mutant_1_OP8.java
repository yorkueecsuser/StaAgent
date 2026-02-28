class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances
        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;

        // Mutant code with renaming of variable 'array' to 'b'
        String bToString = b.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int bHashCode = b.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances
        return "toString: " + bToString + ", hashCode: " + bHashCode;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));

        // Mutant code with renaming of variable'sampleArray' to 'c'
        int[] c = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(c));
    }
}