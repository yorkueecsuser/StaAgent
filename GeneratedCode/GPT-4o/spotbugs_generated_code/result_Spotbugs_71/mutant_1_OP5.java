class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);

        // Introduce an unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This will never be printed");
                break;
            default:
                // Default case that does nothing
                break;
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

    // Helper method to ensure the switch is unreachable
    public static int getUnreachableSwitchValue() {
        return 0; // This value will prevent any case from executing
    }
}