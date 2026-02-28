class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};
        varargMethod(primitiveArray); // Original bug remains: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)

        if (getCondition()) {
            // This code is unreachable due to the condition always being false
            System.out.println("Unreachable code");
        } else {
            System.out.println("This code will always execute");
        }
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }
}