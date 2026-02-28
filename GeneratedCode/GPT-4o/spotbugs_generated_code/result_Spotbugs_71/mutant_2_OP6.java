class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        // Inserted an unreachable for loop
        boolean conditionFor = getCondition(); // Using a method to determine runtime condition
        for (int i = 0; conditionFor; i++) { 
            // Unreachable code block
            System.out.println("This should never be printed.");
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

    // Helper method to return a condition for the for loop
    private static boolean getCondition() {
        return false;  // This will ensure the loop is unreachable, but decided at runtime
    }
}