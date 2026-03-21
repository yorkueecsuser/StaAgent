class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        if (false && true && false && false && true && false && false && true && true && true && false) {float ynwxxrho = -290042576;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}