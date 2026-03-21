class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        if (false && true && true && false && true && false && false && true && false && false && false) {char wezjiuhg = 'q';}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}