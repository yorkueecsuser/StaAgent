class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
        
        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // This will always return a value other than 1
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // This block is always reached instead of case 1
                System.out.println("Default case reached.");
                break;
        }
    }

    public static String showBug(int[] numbers) {
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static String concatenate(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }
    
    public static int getUnreachableCondition() {
        // Always returns 0 to make the switch statement's case 1 unreachable
        return 0;
    }
}