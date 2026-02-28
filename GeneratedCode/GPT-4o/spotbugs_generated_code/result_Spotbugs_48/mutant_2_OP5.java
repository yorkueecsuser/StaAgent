class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            case 2:
                System.out.println("This case is also never reached.");
                break;
            default:
                System.out.println("Default case, but also unreachable.");
                break;
        }

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }

    // Helper method to provide a value that makes the switch statement unreachable
    public static int getUnreachableValue() {
        // Return a value that is not covered by any case
        return -1;
    }
}