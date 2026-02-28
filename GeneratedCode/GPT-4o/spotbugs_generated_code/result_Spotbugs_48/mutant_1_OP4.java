class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Unreachable if-else branch added
        boolean condition = getCondition(); // A method call that returns false
        if (condition) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("Executing else branch.");
        }

        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    private boolean getCondition() {
        return false; // Ensures the if block is never executed
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}