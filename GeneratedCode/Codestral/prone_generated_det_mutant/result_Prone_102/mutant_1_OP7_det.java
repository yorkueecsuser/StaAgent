class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        boolean xpuckzxh = false;while (xpuckzxh && true && true && true && true && true && true && true && false && false && false && false) {short hgsvjcks = -2425;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}