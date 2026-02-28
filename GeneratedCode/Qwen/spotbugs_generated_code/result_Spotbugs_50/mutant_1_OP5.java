class ArrayLengthBug {

    // Method to demonstrate the bug
    public int showBug(int[] array, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i]; // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            
            // Inserting an unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case is unreachable because condition is always false
                    sum -= array[i];
                    break;
                case 1:
                    // This is the reachable case
                    break;
            }
        }
        return sum;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayLengthBug bugDemo = new ArrayLengthBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        try {
            int result = bugDemo.showBug(sampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Sum: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}