class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return sum;
    }

    // Mutant code
    public int showBugMutant(int[] a) {
        int b = 0;
        for (int c = 0; c < a.length; c++) {
            b += a[c];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return b;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));

        // Mutant execution
        System.out.println("Mutant Result: " + example.showBugMutant(numbers));
    }
}