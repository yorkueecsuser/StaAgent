class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        
        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("Neither will this");
        }
    }

    public static String concatenate(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }
    
    // Helper method to ensure dynamic condition
    private static boolean getCondition() {
        return false;
    }
}