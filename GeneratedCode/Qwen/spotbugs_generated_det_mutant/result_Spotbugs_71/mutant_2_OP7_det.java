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
        boolean rydoljab = false;while (rydoljab && true && true && false && true && true && true && true && true && true && true && false) {long sqebqyom = 925248234;}
        printObjects(intArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG) ⁠
        result.append("Passed array as a single object.");
        return result.toString();
    
}

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        int[] myIntArray = {1, 2, 3};
        example.showBug(myIntArray);
    }
}