class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)

        // Mutation: Unreachable switch statement
        boolean condition = getCondition(); // This method dynamically determines the condition at runtime
        if (condition) {
            int unreachableValue = 10; // This variable serves as the switch expression
            switch(unreachableValue) {
                case 1:
                    System.out.println("This is unreachable code.");
                    break;
                case 2:
                    System.out.println("This is also unreachable code.");
                    break;
                default:
                    System.out.println("Default unreachable.");
            }
        }
    }

    // Method to simulate a condition which always returns false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}