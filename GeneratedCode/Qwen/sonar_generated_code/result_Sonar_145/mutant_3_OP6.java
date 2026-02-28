class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will always return false
        }

        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}