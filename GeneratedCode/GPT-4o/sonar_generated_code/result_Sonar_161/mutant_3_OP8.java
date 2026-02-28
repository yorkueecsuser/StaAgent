class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return sum;
    }

    // Mutant code begins
    public int showBugMutant(int[] a) {
        int s = 0;
        for (int j = 0; j < a.length; j++) {
            s += a[j];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return s;
    }
    // Mutant code ends

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));

        // Output for mutant code
        System.out.println("Mutant Result: " + example.showBugMutant(numbers));
    }
}