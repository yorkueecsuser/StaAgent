class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        // Unreachable if-else statement mutation
        boolean isUnreachable = getCondition(); // This will always return false
        if (isUnreachable) {
            System.out.println("This should never be printed.");
        } else {
            System.out.println("This is the reachable else block.");
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
    
    // Helper method to ensure the condition is non-final and determined at runtime
    public static boolean getCondition() {
        return false;
    }
}