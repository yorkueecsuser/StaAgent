class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        boolean xwqlogng = false;while (xwqlogng && true && true && true && false && true && true && false && false && true && false && false) {byte qkfgqlwn = 38;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}