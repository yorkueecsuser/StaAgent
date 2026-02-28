class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Dead Store: Adding an unused variable declaration with a random name
        int abcdwxyz = 42; // This is the dead store added by the mutation operator
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}