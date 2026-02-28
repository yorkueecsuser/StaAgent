class LoopConditionChecker {
    private boolean getFalseCondition() {
        return false;
    }

    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            if (getFalseCondition()) {
                // Unreachable code
                System.out.println("This line should never execute.");
            } else {
                numbers[i] = numbers[i] * 2;
            }
        }
        return numbers;
    }
}