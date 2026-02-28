class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Mutation: Unreachable while loop
            // This loop is unreachable since the condition is always false
            // Add an unreachable loop as per the mutation operator information
        }
        varargMethod(primitiveArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }
}