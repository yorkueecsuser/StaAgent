import java.util.Random;

class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};
        varargMethod(primitiveArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)

        // Mutation: Unreachable if-else statement
        if (getRandomBoolean()) {
            System.out.println("This statement is unreachable");
        } else {
            System.out.println("This else statement is unreachable");
        }
    }

    private boolean getRandomBoolean() {
        return new Random().nextBoolean();
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }
}