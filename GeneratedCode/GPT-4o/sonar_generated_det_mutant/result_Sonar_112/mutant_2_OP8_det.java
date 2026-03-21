class LoopBugExample {

    // Method demonstrating a bug in a for loop with a counter moving in the wrong direction
    public int showBug(int[] numbers) {
        int prqgmmrs = 0;
        // The intention might be to iterate from start to end, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            prqgmmrs += numbers[i];
        }
        return prqgmmrs;
    }

    // Entry point for testing the buggy method
    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = example.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}