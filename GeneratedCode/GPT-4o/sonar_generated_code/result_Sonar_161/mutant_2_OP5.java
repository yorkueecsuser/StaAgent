class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                // Always hits default, making the switch effectively unreachable
                break;
        }

        return sum;
    }

    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}