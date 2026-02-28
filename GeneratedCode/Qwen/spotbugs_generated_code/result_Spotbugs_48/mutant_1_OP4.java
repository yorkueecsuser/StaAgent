class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is an unreachable block because getCondition() will always return false
            System.out.println("This is an unreachable block");
        } else {
            // This block will always execute
            System.out.println("This block will always execute");
        }
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    private boolean getCondition() {
        // Always returns false, making the 'if' block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}