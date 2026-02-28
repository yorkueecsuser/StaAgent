class ArrayOffsetBugExample {

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        try {
            int result = showBug(exampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int offset) {
        // Attempt to access array with an out-of-bounds offset
        int result = array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)

        // Adding unreachable switch statement
        boolean isUnreachable = false; // This variable can be changed to make the condition dynamic
        int unreachableValue = 2; // Arbitrary value to make the switch statement dynamic, but unreachable
        if (isUnreachable) {
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is unreachable case 1");
                    break;
                case 2:
                    System.out.println("This is unreachable case 2");
                    break;
                default:
                    System.out.println("This is unreachable default");
            }
        }

        return result;
    }
}