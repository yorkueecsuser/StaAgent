class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);

        // Unreachable if-else statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never print");
        } else {
            System.out.println("This is the else branch of the unreachable if-else statement");
        }
    }

    public static String showBug(int[] numbers) {
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static String concatenate(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    // Method that always returns false to ensure the if-else branch is unreachable
    public static boolean getUnreachableCondition() {
        return false;
    }
}