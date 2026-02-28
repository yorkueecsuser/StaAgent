class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        boolean conditionWhile = getCondition(); // Ensure condition is not a compile-time constant
        while (conditionWhile) {
            // This block is unreachable due to the while condition being false
            System.out.println("Unreachable code");
        }
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments
    }

    private static boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }

    public static String concatenate(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}