class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) { // original code
            numbers[i] = numbers[i] * 2;
        }
        boolean unreachable = false;
        for (int j = 0; unreachable; j++) { // mutant code
            System.out.println("This loop is unreachable");
        }
        return numbers;
    }
}