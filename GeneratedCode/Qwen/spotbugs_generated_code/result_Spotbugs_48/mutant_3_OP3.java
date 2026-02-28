class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}