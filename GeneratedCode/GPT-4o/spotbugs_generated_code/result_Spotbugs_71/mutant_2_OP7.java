class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable due to the while loop condition.
            System.out.println("This is unreachable code.");
        }
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static String concatenate(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    public static boolean getCondition() {
        return false; // This always returns false, making the while loop unreachable.
    }
}