class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        return sum;
    }

    // Mutated method with renamed variable
    public int showBugMutant(int[] x) {
        int y = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int z = 0; z < x.length; z--) { // BUG: A "for" loop update clause should move the counter in the right direction
            y += x[z];
        }
        return y;
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);

        // Testing the mutated method
        int resultMutant = bugDemo.showBugMutant(numbers);
        System.out.println("Sum from mutant: " + resultMutant);
    }
}