class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;

            // Added unreachable switch statement
            int switchValue = 0;
            switch (switchValue) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
            }
        }
        return numbers;
    }
}