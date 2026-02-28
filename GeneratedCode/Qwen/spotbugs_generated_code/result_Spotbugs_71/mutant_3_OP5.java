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

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                result.append("This is an unreachable case.");
                break;
            default:
                // Default case to ensure switch is not empty and compilable
                result.append("Default case.");
                break;
        }

        result.append("Passed array as a single object.");
        return result.toString();
    }

    // Method to provide a dynamic condition for the switch statement
    private boolean getCondition() {
        return false; // This will always return false, making the switch statement unreachable
    }

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        int[] myIntArray = {1, 2, 3};
        example.showBug(myIntArray);
    }
}