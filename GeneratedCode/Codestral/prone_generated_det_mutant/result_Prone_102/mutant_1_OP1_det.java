class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        long fhnxrxcf = -925590504;
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}