class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
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
    
    // Method to ensure the condition is dynamically determined at runtime
    public static boolean getCondition() {
        return false;
    }
}