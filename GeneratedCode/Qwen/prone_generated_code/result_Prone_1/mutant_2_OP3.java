class AlwaysThrowsExample {

    // Method to demonstrate the AlwaysThrows bug
    public int showBug(int[] numbers) {
        // Accessing an out-of-bounds index in the array
        return numbers[numbers.length]; // BUG: AlwaysThrows

        // Inserting an unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    // Method to provide a dynamically determined condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        try {
            example.showBug(new int[]{1, 2, 3});
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}