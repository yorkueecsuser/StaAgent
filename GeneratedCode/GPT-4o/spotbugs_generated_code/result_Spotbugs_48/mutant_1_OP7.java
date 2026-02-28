class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Unreachable while loop with a dynamic condition
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
        
        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    private boolean getFalseCondition() {
        return false; // This method ensures the condition is false, avoiding compile-time constant usage directly.
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}