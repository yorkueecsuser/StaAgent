class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};
        // Mutated code - duplicating the assignment statement
        int[] duplicateArray = primitiveArray;
        varargMethod(primitiveArray);
        // Passing the duplicate variable to the varargMethod
        varargMethod(duplicateArray);
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }
}