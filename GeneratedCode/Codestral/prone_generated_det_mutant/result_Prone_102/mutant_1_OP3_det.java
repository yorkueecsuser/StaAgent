class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        if (true && false && true && true && true && false && false && false && false && true && false) {short goxtrpwt = 2185;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}