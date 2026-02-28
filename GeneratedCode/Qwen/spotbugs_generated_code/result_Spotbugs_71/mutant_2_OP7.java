class VarargsBugExample {

    // Method that expects a variable number of Object arguments
    public void printObjects(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    // Method to demonstrate the bug
    public String showBug(int[] intArray) {
        StringBuilder result = new StringBuilder();
        printObjects(intArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG) ⁠

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            result.append("This is an unreachable loop.");
        }

        result.append("Passed array as a single object.");
        return result.toString();
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        int[] myIntArray = {1, 2, 3};
        example.showBug(myIntArray);
    }
}