class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }

        // Adding unreachable if-else statement mutation
        boolean condition = getCondition(); // This condition will always evaluate to false.
        if (condition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This branch is also unreachable"); // Keeping a consistent structure
        }

        return sum;
    }

    // This method always returns false, making the if-else unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}