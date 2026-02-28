class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances
        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;

        // Mutant code
        String b = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int c = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances
        return "toString: " + b + ", hashCode: " + c;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}