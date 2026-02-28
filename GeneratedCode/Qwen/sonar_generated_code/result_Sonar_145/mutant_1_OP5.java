class ArrayHashToStringBug {

    public String showBug(int[] array) {
        String arrayToString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        int arrayHashCode = array.hashCode();   // BUG: "hashCode" and "toString" should not be called on array instances

        // Inserting unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable because alwaysFalse is never true
                arrayToString = "This will never be executed";
                break;
            case false:
                // This case is also unreachable because alwaysFalse is never true
                arrayHashCode = 0;
                break;
        }

        return "toString: " + arrayToString + ", hashCode: " + arrayHashCode;
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayHashToStringBug bugDemo = new ArrayHashToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray));
    }
}