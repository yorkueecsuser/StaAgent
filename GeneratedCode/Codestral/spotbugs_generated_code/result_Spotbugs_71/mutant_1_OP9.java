class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};
        varargMethod(primitiveArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public void loopMethod(Object... objects) {
        int i = 0;
        // Original for loop
        // for (Object obj : objects) {
        //     System.out.println(obj);
        // }

        // Replacement with do-while loop
        do {
            System.out.println(objects[i]);
            i++;
        } while (i < objects.length);
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
        bugInstance.loopMethod("Hello", "World");
    }
}