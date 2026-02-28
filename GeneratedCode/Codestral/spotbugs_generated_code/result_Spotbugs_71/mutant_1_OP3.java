class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};

        // Inserted unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This statement will never be executed.");
        }

        varargMethod(primitiveArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }
}