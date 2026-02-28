class ArrayOffsetBug {

    // Method to demonstrate the Array offset out of bounds bug
    public int showBug(int[] array, int offset) {
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET) 
        return array[offset];
    }

    public static void main(String[] args) {
        ArrayOffsetBug bugDemo = new ArrayOffsetBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        try {
            // Calling the buggy method with an offset that is out of bounds
            int result = bugDemo.showBug(sampleArray, 5);
            System.out.println("Result: " + result);

            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    System.out.println("This is unreachable");
                    break;
                case 1:
                    System.out.println("This is also unreachable");
                    break;
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Method to provide a dynamic condition for the switch statement
    private static boolean getCondition() {
        return false;
    }
}