class LoopConditionChecker {
    public boolean getCondition() {
        return false; // Always false to make the if-else branch unreachable
    }

    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            if (getCondition()) {
                System.out.println("This line is unreachable");
            } else {
                // Original code
                numbers[i] = numbers[i] * 2;
            }
            // Ensure the loop condition is modified in the loop body to avoid infinite loop
            i++;
        }
        return numbers;
    }
}