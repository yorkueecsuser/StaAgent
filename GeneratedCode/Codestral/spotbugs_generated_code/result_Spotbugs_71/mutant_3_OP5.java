class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        // Add unreachable switch statement
        boolean unreachableCondition = false;
        switch (unreachableCondition) {
            case true:
                System.out.println("Unreachable code");
                break;
        }

        for (Object obj : objects) {
            System.out.println(obj);
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