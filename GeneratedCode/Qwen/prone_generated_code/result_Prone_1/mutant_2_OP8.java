class AlwaysThrowsExample {

    // Method to demonstrate the AlwaysThrows bug
    public int showBug(int[] numbers) {
        // Accessing an out-of-bounds index in the array
        return numbers[numbers.length]; // BUG: AlwaysThrows
    }

    // Mutated method with renamed variable
    public int showBugMutated(int[] a) {
        // Accessing an out-of-bounds index in the array
        return a[a.length]; // BUG: AlwaysThrows
    }

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        try {
            example.showBug(new int[]{1, 2, 3});
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Testing the mutated method
        try {
            example.showBugMutated(new int[]{1, 2, 3});
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception in mutated method: " + e.getMessage());
        }
    }
}