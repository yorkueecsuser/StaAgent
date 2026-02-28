class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        boolean unreachableCondition = shouldRunUnreachableCode(); // Non-final variable used
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static String concatenate(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    public static boolean shouldRunUnreachableCode() {
        return false; // Always returns false, making the if statement unreachable
    }
}