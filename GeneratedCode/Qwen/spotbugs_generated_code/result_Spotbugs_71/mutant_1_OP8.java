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
        result.append("Passed array as a single object.");
        return result.toString();
    }

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        int[] myIntArray = {1, 2, 3};
        example.showBug(myIntArray);
    }

    // Mutated code starts here
    // Renaming variable 'example' to 'a'
    public void demonstrateRenaming() {
        VarargsBugExample a = new VarargsBugExample();
        int[] b = {4, 5, 6};
        a.showBug(b);
    }
}