class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Attempt to access the element at index equal to the length of the array
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This line will never be executed.");
        }
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    public boolean getFalseCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}