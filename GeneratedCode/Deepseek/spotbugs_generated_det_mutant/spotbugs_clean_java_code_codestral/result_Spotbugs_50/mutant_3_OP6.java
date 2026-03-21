class BuggyArray {
    // Method that has the array length out of bounds bug
    public static int showBug(int[] arr, int length) {
        // Inserting unreachable for loop as per the given mutation operator
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code will never execute because the loop condition is always false
            System.out.println("Unreachable code");
        }
        return arr[length];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }
}