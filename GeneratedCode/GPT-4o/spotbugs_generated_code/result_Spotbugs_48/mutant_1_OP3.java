class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        
        // Unreachable if branch added
        boolean condition = getDynamicCondition();
        if (condition) {
            System.out.println("This is an unreachable branch.");
        }
    }

    private boolean getDynamicCondition() {
        // Returns a dynamic condition that is always false
        return 1 > 2; // This will always be false at runtime
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}