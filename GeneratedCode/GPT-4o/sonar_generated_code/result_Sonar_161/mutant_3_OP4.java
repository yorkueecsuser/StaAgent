class LoopBugExample {

    private boolean alwaysFalse() {
        return false;
    }

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
            
            // Inserting unreachable if-else branch
            if (alwaysFalse()) {
                // This block is unreachable
                sum *= 2;
            } else {
                // This block is also unreachable
                sum /= 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}