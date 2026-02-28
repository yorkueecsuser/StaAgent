class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }

        // Unreachable for loop mutation
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This line will never be printed");
        }
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};
        varargMethod(primitiveArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }
}