class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return sum;
    }

    // Mutant code: Renamed the variable `sum` to `a`
    public int showBugMutant(int[] numbers) {
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return a;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
        // Testing the mutant method
        System.out.println("Mutant Result: " + example.showBugMutant(numbers));
    }
}