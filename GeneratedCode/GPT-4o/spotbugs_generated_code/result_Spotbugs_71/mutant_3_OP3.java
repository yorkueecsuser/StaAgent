class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);

        // Introduce a non-final variable for condition
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
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

    // Method to return false and avoid unreachable statement errors
    public static boolean getFalseCondition() {
        return false;
    }
}