class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Unreachable for loop inserted
        boolean loopCondition = false; // This is not final, ensuring it's not a compile-time constant
        for (int i = 0; loopCondition; i++) {
            System.out.println("This loop is unreachable and should never execute.");
        }
        
        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}