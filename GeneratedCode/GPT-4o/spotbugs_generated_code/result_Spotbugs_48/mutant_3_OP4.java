class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Unreachable if-else branch added
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
        }

        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    private boolean getFalseCondition() {
        return false; // This method returns false, making the if-condition always false
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}