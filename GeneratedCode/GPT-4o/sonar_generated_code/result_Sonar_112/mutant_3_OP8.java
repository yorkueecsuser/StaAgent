class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        return sum;
    }

    public int showBugMutant(int[] z) { // Renaming the parameter 'numbers' to 'z'
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < z.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += z[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);

        int resultMutant = bugDemo.showBugMutant(numbers);
        System.out.println("Sum from mutant: " + resultMutant);
    }
}