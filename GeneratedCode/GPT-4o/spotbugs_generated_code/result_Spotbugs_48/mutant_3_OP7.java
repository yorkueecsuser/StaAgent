class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Insert a unique unreachable while loop
        boolean conditionWhile = getCondition();  // Using a method for condition
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }

        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    private boolean getCondition() {
        return false; // Condition always returns false making the while loop unreachable
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}