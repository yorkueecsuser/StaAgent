class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            int value = getValue();
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code will never be executed");
                    break;
            }
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }

    private int getValue() {
        return 0;  // Always return 0 to make the switch statement unreachable
    }
}